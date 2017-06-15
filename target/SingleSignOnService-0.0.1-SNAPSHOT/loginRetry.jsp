<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
		
		<title>Single-Sign-On Service Demo - Login</title>
	</head>
	
	<body>
	<div class="container">
  		<div class="page-header">
  			<h2>SSO Login Service</h2>
  			
  			<div class="panel panel-danger">
      			<div class="panel-heading">Access Denied</div>
      			<div class="panel-body">Your credential is invalid. Please try again.</div>
    		</div>
		</div>
		
		<form action="/sso/login.action" method="post">
			<div class="form-group">
	   			 <label for="username">Username:</label>
	    		<input type="text" class="form-control" name="username">
	  		</div>
	  		<div class="form-group">
	   			 <label for="password">Password:</label>
	    		<input type="password" class="form-control" name="password">
	  		</div>

	  		<input type="hidden" name="gotoURL" value ="<s:property value="gotoURL"/>" />
	   		<button type="submit" class="btn btn-primary">Submit</button>
			<button type="reset" class="btn btn-default">Reset</button>
		</form>
	</div>
</html>