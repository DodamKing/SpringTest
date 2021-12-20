<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>nav</title>
	<jsp:include page="../include/bs4.jsp" />
</head>
<body>
	<div style="width: 100%; height: 50px; background: yellow; text-align: center;">
		<a href="${ctp }/tiles/tilesMain">홈으로</a> |
		<a href="${ctp }/tiles/guest/guestList">방명록</a> |
		<a href="${ctp }/tiles/board/boardList">게시판</a> |
		<a href="${ctp }/tiles/pds/pdsList">자료실</a> |
		<a href="${ctp }/tiles/login">로그아웃</a> |
		<c:if test="${sLevel == 1 }">
			<a href="${ctp }/tiles/admin/adminList">관리자</a> |
		</c:if>
	</div>
</body>
</html>