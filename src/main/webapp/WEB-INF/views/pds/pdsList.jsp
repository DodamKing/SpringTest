<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>pds</title>
	<jsp:include page="../include/bs4.jsp" />
</head>
<body>
	<div class="container mt-5">
		<h2>자료실</h2>
		<hr>
		<p><img src="${ctp }/img/dog9.jpg" width="300px" ></p>
		<hr>
	</div>
</body>
</html>