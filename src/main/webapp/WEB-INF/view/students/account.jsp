<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error {
		color:#f00;
		font-weight: bold;
		font-size: 20px;
		
	}
</style>
</head>
<body>
	<!--  <form action="studentprocess">
		<input type="text" name="firstname" placeholder="First Name" />
		<input type="text" name="lastname" placeholder="Last Name"/>
		<input type="text" name="age" placeholder="Age" />
		<input type="submit" value="Login" />
	</form>  -->
	<form:form modelAttribute="student" action="studentprocess">
		<form:input path="fName" placeholder="First Name"/>
		<form:errors path="fName" cssClass="error"/>
		<br /><br />
		<form:input path="lName" placeholder="Last Name"/>
		<form:errors path="lName" cssClass="error"/><br /><br />
		
		<br /><br />
		<form:input path="email" placeholder="Email" />
		<form:errors path="email" cssClass="error" /><br /><br />
		<form:input path="age" placeholder="Age"/>
		<form:errors path="age" cssClass="error" /><br /><br />
		
		<form:input path="code" placeholder="Code" />
		<form:errors path="code" cssClass="error" /><br><br>
		<form:select path="country">
			<form:options items="${ student.countryOption}"/>
		</form:select>
		<br /><br /><br />
		Choose Your Lang:
		<form:radiobutton path="language" value="Java"/>Java
		<form:radiobutton path="language" value="PHP" />PHP
		<form:radiobutton path="language" value="Python" />Python
		<form:radiobutton path="language" value="Ruby" />Ruby
		<br /><br /><br />	
		Players:
		<form:checkbox path="players" value="Messi"/>Messi
		<form:checkbox path="players" value="CR7" />CR7
		<form:checkbox path="players" value="Salah" />Salah<br /><br />
		<input type="submit" value="Done" />
	</form:form>
</body>
</html>