<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<h1 class="text-center mt-4">Send an Omikuji!</h1>
	<form action="/submit" method="post" class="px-5 py-3 bg-light rounded w-50 mx-auto mt-4">
		<div class="mb-3">
			<label for="num" class="form-label">Pick any number from 5-25</label>
			<input type="number" class="form-control w-25" min="5" max="25" name="num"/>
		</div>
		<div class="mb-3">
			<label for="city" class="form-label">Enter the name of any city</label>
			<input type="text" class="form-control" name="city"/>
		</div>		
		<div class="mb-3">
			<label for="person" class="form-label">Enter the name of any real person</label>
			<input type="text" class="form-control" name="person"/>
		</div>
		<div class="mb-3">
			<label for="hobby" class="form-label">Enter a professional endeavor or hobby</label>
			<input type="text" class="form-control" name="hobby"/>
		</div>
		<div class="mb-3">
			<label for="thing" class="form-label">Enter any type of living thing</label>
			<input type="text" class="form-control" name="thing"/>
		</div>
		<div class="mb-3">
			<label for="nice" class="form-label">Say something nice to someone</label>
			<textarea name="nice" cols="10" rows="5" class="form-control"></textarea>
		</div>
		
		<p class="fst-italic">Send and show a friend</p>
		<input type="submit" value="Send" class="btn btn-primary"/>
	</form>
</body>
</html>