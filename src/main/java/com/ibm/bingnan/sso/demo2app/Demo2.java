package com.ibm.bingnan.sso.demo2app;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

import com.ibm.bingnan.sso.util.LoginCheck;

public class Demo2 extends ActionSupport {
	private String gotoURL;
	private String appName;
	
	public String main() {
		
		// check cookie first
		HttpServletRequest request = ServletActionContext.getRequest();
		if(LoginCheck.checkCookie(request)) {
			return SUCCESS;
		}
		
		gotoURL = "/demo2/main.action";
		appName = "Demo-2 App";
		
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
