<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_02_res</title>
</head>
<body>
<!--  data=홍길동&chk=서울&chk=부산 -->

<!--  출력방법 3가지 -->

<%  //scriptlet jsp 에서 java소스를 구현해줄때
	String data = request.getParameter("data");
	out.print("<p>" + data + "</p>");
%>

<p> <%=data %> </p>

<p> ${param.data} </p>

<!-- 리턴값 여러개일때 배열로 받기 -->
<% String[] chk=request.getParameterValues("chk"); %>

</body>
</html>