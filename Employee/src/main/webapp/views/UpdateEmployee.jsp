<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
 
  
  background-color: #cccccc;

}
</style>
<form action="UpdateEmployee" method="get">
<center>Id:<input type="text" value="${empid}" name="Id" readonly></center><br>
<center>Name:<input type="text" name="name"></center><br>
<center>Dob:<input type="date" name="date"></center><br>
<center>Salary:<input type="number" name="salary"></center><br>
<center><input type="submit" value="Update"></center>
</form>
</body>
</html>