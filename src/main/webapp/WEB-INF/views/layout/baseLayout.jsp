<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>title</title>
	<%@include file="../include/bs4.jsp" %>
</head>
<body>
<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="nav" />

<div class="container" style="height: 500px;">
	<tiles:insertAttribute name="content" />
</div>

<tiles:insertAttribute name="footer" />
</body>
</html>