<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer registration</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>

	<h1 align="center">Customer Registration</h1>

	<br>
	<br>

	<form:form action="../validate/validateForm" modelAttribute="customer">

		<form:label path="firstName">First Name:</form:label>
		<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />

		<br>
		<br>
		<form:label path="lastName">Last Name:</form:label>
		<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		<form:label path="email">Email Id:</form:label>
		<form:input path="email" />
		<form:errors path="email" cssClass="error" />

		<br>
		<br>
		<form:label path="dateOfBirth">Date Of Birth(YYYY-MM-/DD) :</form:label>
		<form:input path="dateOfBirth" />
		<form:errors path="dateOfBirth" cssClass="error" />
		<br>
		<br>



		<br>
		<br>
		<form:select path="accountType">

			<form:options items="${customer.accountTypeOptions}" />

		</form:select>
		<br>
		<br>

		<form:radiobuttons items="${customer.genderType}" path="gender" />
		<br>
		<br>

		<form:checkboxes items="${customer.gifts}" path="giftsSelected" />

		<br>
		<br>



		<input type="submit" value="Submit Here">

	</form:form>

</body>
</html>