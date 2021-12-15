<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect</title>
</head>
<body>
	<h2>폼태그</h2>
	<form method="post">
		아이디 : <input id="mid" name="mid" type="text" value="${mid }">
		비밀번호 : <input id="pwd" name="pwd" type="password" value="${pwd }">
		<input type="submit" value="확인" >
	</form>
	<p>${message }</p>
</body>
</body>
</html>