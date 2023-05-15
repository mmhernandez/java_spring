<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Simple Receipt</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1>Customer Name: <c:out value="${name}"/> </h1>
	<p>Item name: <c:out value="${item}"/></p>
	<p>Price: $<c:out value="${price}"/> </p>
	<p>Description <c:out value="${description}"/></p>
	<p>Vendor: <c:out value="${vendor}"/></p>
</body>
</html>