<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" isELIgnored="false"%>
  
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  
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

<table border="2" align="center">
<tr>
<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Date of Birth</th>
<th>Employee salary</th>
<th>Employee Identity</th>




<c:forEach items="${AllEmployee}" var="emp">
<tr>
<td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.date}</td>
    <td>${emp.salary}</td>
 
<%-- <table>

<c:forEach items="${AllEmployee}" var="emp">
<tr>
<td> ${emp.Id }</td>
<td>${emp.name }</td>
<td>${emp.salary }</td>
<td>${emp.date }</td> --%>
</c:forEach>
</table> 
</body>
</html>