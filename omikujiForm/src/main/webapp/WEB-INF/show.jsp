<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
	
	<h1 class="text-center mt-4">Here's Your Omikuji!</h1>
	<div class="mt-2 border border-primary mx-auto bg-light w-25 px-5 py-3">
		<h4>
			In <c:out value="${num}"/> years, you will live in <c:out value="${city}"/> 
			with <c:out value="${person}"/> as your room mate, <c:out value="${hobby}"/> for a living.
			The next time you see a <c:out value="${thing}"/>, you will have good luck.
			Also, <c:out value="${nice}"/>
		</h4>
	</div>
		
	<div class="text-center mt-4">
		<a href="/omikuji">Go Back</a>
	</div>
</body>
</html>