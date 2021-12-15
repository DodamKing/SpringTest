<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>resources.jsp</title>
</head>
<body>
	<h2>리소스 연습(리소스방)</h2>
	기본. : <img src="${ctp }/resources/img/dog10.jpg" width="200px" > <br>
	기본. : <img src="${ctp }/resources/img/dog1.jpg" width="200px" > <br>
	이미지방. : <img src="${ctp }/img/dog2.jpg" width="200px" > <br>
	보드빙. : <img src="${ctp }/board/dog8.jpg" width="200px" > <br>
	멤버방. : <img src="${ctp }/member/dog6.jpg" width="200px" > <br>
	피디에스방. : <img src="${ctp }/pds/dog4.jpg" width="200px" > <br>
	씨에스에스방. : <img src="${ctp }/css/dog3.jpg" width="200px" > <br>
	상대경로. : <img src="../resources/css/dog3.jpg" width="200px" > <br>
</body>
</html>