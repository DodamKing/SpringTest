<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test3</title>
</head>
<body>
	<h2>test3 view</h2>
	<p>주소창에 contextpath/1215/test3로 접속</p>
	<p>
		성명 : ${name } <br>
		나이 : ${age }<br>
		주소 : ${address }<br>
	</p>
</body>
</body>
</html>