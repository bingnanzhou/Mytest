package com.ibm.bingnan.sso.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class LoginCheck {
	private static final String USERNAME = "SSO";
	private static final String PASSWORD = "123";
	private static final String NULL = "";
	
	public static boolean checkLogin(String username, String password) {
		if(username != null && password != null) {
			if(username.equals(USERNAME) && password.equals(PASSWORD)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean checkCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("ssocookie") && c.getValue().equals("mysso") && c.getMaxAge() != 0) {
					return true;
				}
			}
		}
		return false;
	}
}
