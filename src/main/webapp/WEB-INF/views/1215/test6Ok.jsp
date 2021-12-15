<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test6Ok</title>
</head>
<body>
	<h2>폼태그</h2>
	<form action="" method="post">
		아이디1 : ${vo.mid1 } <br>
		아이디2 : ${vo.mid2 } <br>
		아이디3 : ${vo.mid3 } <br>
		아이디4 : ${vo.mid4 } <br>
		아이디5 : ${vo.mid5 } <br>
		임시아이디 : ${vo.mid_ } <br>
		비밀번호 : ${vo.pwd } <br>
		<a href="${ctp }/1215/test6">돌아가기</a>
	</form>
</body>
</body>
</html>