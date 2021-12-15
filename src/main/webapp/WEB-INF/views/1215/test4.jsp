<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test4</title>
</head>
<body>
	<h2>test4 view</h2>
	<p>주소창에 contextpath/1215/test4로 접속</p>
	<p>
		아이디 : ${mid } <br>
		비밀번호 : ${pwd }<br>
		이름 : ${name }<br>
	</p>
</body>
</body>
</html>