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
	<!--  <form action="studentprocess">
		<input type="text" name="firstname" placeholder="First Name" />
		<input type="text" name="lastname" placeholder="Last Name"/>
		<input type="text" name="age" placeholder="Age" />
		<input type="submit" value="Login" />
	</form>  -->
	<form:form modelAttribute="student" action="studentprocess">
		<form:input path="fName"/>
		<form:input path="lName"/>
		<form:input path="age"/>
		<form:select path="country">
			<form:option value="Egupt" label="EG" />
			<form:option value="Brazil" label="BR" />
			<form:option value="German" label="GR" />	
		</form:select>
		<input type="submit" value="Done" />
	</form:form>
</body>
</html>