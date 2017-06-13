<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  


<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Order Confirmation Page</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>
<body>
<div class="generic-container">
	<div class="alert alert-success lead">
    	<c:out value="${success}"/>  
    	
	</div>
	
	<span class="well floatRight">
		<a href="<c:url value='/newOrder' />">Buy More</a>
	</span>
	
	<span class="well floatRight">
		<a href="<c:url value='/checkStatus' />">Check Status</a>
	</span>
	
</div>
</body>

</html>


<html>
   <head></head>
   <body>
       ${success}
   </body>
</html>