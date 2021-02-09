<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'viewemp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my viewemp page. <br>
    <h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${emplist}">   
	   <tr>  

	   <td>${emp.id}</td>  
	   <td>${emp.name}</td>  
	   <td>${emp.salary}</td>  
	   <td>${emp.designation}</td>  
	   <td><a href="employeedetails/editemp/${emp.id}">Edit</a></td>  
	   <td><a href="employeedetails/deleteemp/${emp.id}">Delete</a></td>  
	   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>  
  </body>
</html>
