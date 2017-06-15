package com.ibm.bingnan.sso.demo1app;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.ibm.bingnan.sso.util.LoginCheck;

public class Demo1 extends ActionSupport {
	private String gotoURL;
	private String appName;
	
	public String main() {
		
		// check cookie first
		HttpServletRequest request = ServletActionContext.getRequest();
		if(LoginCheck.checkCookie(request)) {
			return SUCCESS;
		}
		
		setGotoURL("/demo1/main.action");
		appName = "Demo-1 App";
		
		return LOGIN;
	}

	public String getGotoURL() {
		return gotoURL;
	}

	public void setGotoURL(String gotoURL) {
		this.gotoURL = gotoURL;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	
	
}
