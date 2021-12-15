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
	<form action="${ctp }/1215/test5Ok" method="post">
		아이디 : <input id="mid" name="mid" type="text">
		비밀번호 : <input id="pwd" name="pwd" type="password">
		<input type="submit" value="확인" >
	</form>
</body>
</body>
</html>