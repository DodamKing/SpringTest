<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>tilesMain</title>
	<%@include file="../include/bs4.jsp" %>
</head>
		<c:if test="${sLevel == 1 }" ><c:set var="lv" value="관리자" /></c:if>
		<c:if test="${sLevel == 2}" ><c:set var="lv" value="운영자" /></c:if>
		<c:if test="${sLevel == 3}" ><c:set var="lv" value="우수회원" /></c:if>
		<c:if test="${sLevel == 4}" ><c:set var="lv" value="정회원" /></c:if>
		<c:if test="${sLevel == 5}" ><c:set var="lv" value="준회원" /></c:if>
		<c:if test="${sLevel == 6}" ><c:set var="lv" value="비회원" /></c:if>
<body>
	<div class="container mt-5">
		<h2>타일로 들어온 메인 화면</h2>
		<p>아이디 : ${sMid }</p>
		<p>별명 : ${sNick }</p>
		<p>레벨 : ${lv }</p>
		<hr>
		<p><img src="${ctp }/img/dog5.jpg" width="300px"></p>
	</div>
</body>
</html>