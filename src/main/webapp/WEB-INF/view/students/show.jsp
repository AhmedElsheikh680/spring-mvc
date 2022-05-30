<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Students</h1>
	<h3>First Name: ${student.fName}</h3>
	<h3>Last Name: ${student.lName }</h3>
	<h3>Age: ${student.age}</h3>
	<h3>Country: ${student.country }</h3>
	<h3>Language: ${student.language }</h3>
</body>
</html>