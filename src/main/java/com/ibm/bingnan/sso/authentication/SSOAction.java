package com.ibm.bingnan.sso.authentication;

import com.ibm.bingnan.sso.util.LoginCheck;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SSOAction extends ActionSupport {
	private String username;
	private String password;
	private String gotoURL;
	private String message;
	private String NULL = "";
	
	public String login() {
		boolean isValid = LoginCheck.checkLogin(username, password);
		
		if(isValid) {
			Cookie cookie = new Cookie("ssocookie", "mysso");
			cookie.setPath("/");
			
			HttpServletResponse response = ServletActionContext.getResponse();
			response.addCookie(cookie);
			
			checkLoginStatus();
			return SUCCESS;
		}
		
		checkLoginStatus();
		return LOGIN;
	}
	
	public String logout() {	
		Cookie cookie = new Cookie("ssocookie", "mysso");
		cookie.setPath("/");
		cookie.setMaxAge(0);
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.addCookie(cookie);
		
		return LOGIN;
	}
	
	public String checkLoginStatus() {
		HttpServletRequest request = ServletActionContext.getRequest();

		if(LoginCheck.checkCookie(request)) {
			message = "You already logged in.";
			return SUCCESS;
		}
		message = "You have not logged in.";
		return LOGIN;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getGotoURL() {
		return gotoURL;
	}

	public void setGotoURL(String gotoURL) {
		this.gotoURL = gotoURL;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
