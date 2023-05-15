<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Time</title>
	
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<div class="d-flex justify-content-center gap-4 text-primary fw-bold my-5 py-5">
		<a href="/">Back</a>
	</div>
	<h1 class="text-center my-5 py-5 text-primary"><c:out value="${time}"/></h1>
	
	<script type="text/javascript" src="/js/app.js"></script>
	
</body>
</html>