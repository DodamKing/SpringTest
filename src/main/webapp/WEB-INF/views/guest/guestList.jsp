<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>title</title>
	<%@include file="../include/bs4.jsp" %>
</head>
<body>
	<div class="container mt-5">
		<h2>방명록</h2>
		<hr>
		<p><img src="${ctp }/img/dog3.jpg" width="300px" ></p>
		<hr>
	</div>
</body>
</html>