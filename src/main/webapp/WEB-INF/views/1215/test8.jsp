<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test8</title>
</head>
<body>
	<h2>폼태그8</h2>
	<form action="${ctp }/1215/test8Ok" method="post">
		아이디1 : <input id="mid1" name="mid1" type="text"> <br>
		아이디2 : <input id="mid2" name="mid2" type="text"> <br>
		아이디3 : <input id="mid3" name="mid3" type="text"> <br>
		아이디4 : <input id="mid4" name="mid4" type="text"> <br>
		아이디5 : <input id="mid5" name="mid5" type="text"> <br>
		비밀번호 : <input id="pwd" name="pwd" type="password"> <br>
		<input type="submit" value="확인" >
	</form>
</body>
</body>
</html>