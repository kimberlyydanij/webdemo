<%@page import="servletdemo.part03.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//scriptlet : jsp 에서 자바코드 구현
		MemberDTO dto = (MemberDTO)request.getAttribute("dto");
	%>
	<p><%=dto.getFid() %> / <%=dto.getFpass() %></p>
	
	<p>${requestScope.dto.fid} / ${requestScope.dto.fpass} </p>
</body>
</html>