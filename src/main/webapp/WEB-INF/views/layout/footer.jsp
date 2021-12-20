<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>footer</title>
	<%@include file="../include/bs4.jsp" %>
</head>
<body>
	<div style="width: 100%; height: 80px; background: gray; text-align: center;">
		<h3>이곳은 푸터 라네</h3>
	</div>
</body>
</html>