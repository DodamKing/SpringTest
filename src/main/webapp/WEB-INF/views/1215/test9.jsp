<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test9</title>
</head>
<body>
	<h2>폼태그9</h2>
	<form method="post">
		아이디1 : <input id="mid1" name="mid1" type="text" value="${vo.mid1}"> <br>
		아이디2 : <input id="mid2" name="mid2" type="text" value="${vo.mid2}"> <br>
		아이디3 : <input id="mid3" name="mid3" type="text" value="${vo.mid3}"> <br>
		아이디4 : <input id="mid4" name="mid4" type="text" value="${vo.mid4}"> <br>
		아이디5 : <input id="mid5" name="mid5" type="text" value="${vo.mid5}"> <br>
		비밀번호 : <input id="pwd" name="pwd" type="password" value="${vo.pwd}"> <br>
		<input type="submit" value="확인" >
	</form>
</body>
</body>
</html>