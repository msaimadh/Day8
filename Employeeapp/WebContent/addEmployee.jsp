<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Employee Page</title>
</head>
<body bgcolor="aqua">
<h1>Add new Employee</h1>
<hr>
<form action="addEmployee" method="post">
<label>Employee id:</label>
<input type="number" name="empId"required/>
<br>
<label>Employee Name:</label>
<input type="text" name="empName"required/>
<br>
<label>Employee salary:</label>
<input type="number" name="empSalary"required/>
<br>
<label>Employee Department:</label>
<select name="empDept" required>
<option value="">---Select--</option>
<option value="IT">IT</option>
<option value="ADMIN">ADMIN</option>
<option value="ACCOUNTS">ACCOUNTS</option>
<option value="HR">HR</option>
</select>
<br>
<input type="submit" value="Add Employee"/>
</form>
</body>
</html>






