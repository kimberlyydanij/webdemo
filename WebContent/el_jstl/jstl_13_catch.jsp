<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_13_catch</title>
</head>
<body>
	<%
		try{
			
			String data = request.getParameter("data");
			int num = Integer.parseInt(data);
			out.println(num);
		}catch(NumberFormatException ex) {
			out.println(ex.toString());
		}
	%>

<hr />
<c:catch var="ex">	
	<%-- <c:set var="data" value="${param.data}" />
	  <p>${data}</p>  --%>
	
	<%
	String data = request.getParameter("data");
	int num = Integer.parseInt(data);
	out.println(num); 
 	%>
</c:catch>
<p> ${empty ex ? "OK" : ex} </p>
</body>
</html>