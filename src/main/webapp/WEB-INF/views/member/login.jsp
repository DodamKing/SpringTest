<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctp" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>login</title>
	<jsp:include page="../include/bs4.jsp" />
	<%-- <%@include file="../include/bs4.jsp" %> --%>
</head>
<body>
	<div class="container mt-5">
		<h2>로그인이지롱</h2>
		<form method="post">
			<table class="table">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="mid" class="form-control" ></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pwd" class="form-control" ></td>
				</tr>
				<tr>
					<td>별명</td>
					<td><input type="text" name="nick" class="form-control" ></td>
				</tr>
				<tr>
					<td>레벨</td>
					<td>
						<select name="level" class="form-control" >
							<option value=6>비회원</option>
							<option value=5>준회원</option>
							<option value=4>정회원</option>
							<option value=3>우수회원</option>
							<option value=2>운영자</option>
							<option value=1>관리자</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="d-flex justify-content-around">
							<input type="submit" value="로그인" class="btn btn-warning col-2">
							<input type="reset" value="취소" class="btn btn-warning col-2">
							<input type="reset" value="돌아기기" class="btn btn-warning col-2" onclick="location.href='${ctp}/'">
						</div>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>