<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_15_formatDate</title>
</head>
<body>
<c:set var="today" value="<%=new Date() %>" />
<p>${today }</p>

<p>
<!-- 2022. 6. 2. 오후 4:52:07 -->
<fmt:formatDate value="${today }" type="both"  dateStyle="default" timeStyle="default"/>
</p>

<p>
<!-- 22. 6. 2. 오후 4:52-->
<fmt:formatDate value="${today }" type="both"  dateStyle="short" timeStyle="short"/>
</p>


<p>
<!-- 2022. 6. 2. 오후 4:53:25-->
<fmt:formatDate value="${today }" type="both"  dateStyle="medium" timeStyle="medium"/>
</p>

<p>
<!-- 2022년 6월 2일 오후 4시 54분 17초 KST-->
<fmt:formatDate value="${today }" type="both"  dateStyle="long" timeStyle="long"/>
</p>

<p>
<!-- 2022년 6월 2일 목요일 오후 4시 54분 47초 대한민국 표준시 -->
<fmt:formatDate value="${today }" type="both"  dateStyle="full" timeStyle="full"/>
</p>

<p>
<!-- 2022년 6월 2일 목요일-->
<fmt:formatDate value="${today }" type="date"  dateStyle="full" timeStyle="full"/>
</p>

<p>
<!-- 오후 4시 54분 47초 대한민국 표준시 -->
<fmt:formatDate value="${today }" type="time"  dateStyle="full" timeStyle="full"/>
</p>
</body>
</html>






