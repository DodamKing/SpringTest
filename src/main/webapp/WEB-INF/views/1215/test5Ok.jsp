<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test5</title>
</head>
<body>
	<h2>폼태그</h2>
	<form action="" method="post">
		아이디 : ${mid } <br>
		비밀번호 : ${pwd } <br>
		<a href="${ctp }/1215/test5">돌아가기</a>
	</form>
</body>
</body>
</html>