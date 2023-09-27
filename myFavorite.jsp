<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="regBean" class="ch04.FavoriteBean" scope="page" />
	<jsp:setProperty name="regBean" property="color" />
	<jsp:setProperty name="regBean" property="flower" />
	<jsp:setProperty name="regBean" property="music" />



	<p>당신이 좋아하는 색깔은 <jsp:getProperty name="regBean" property="color" />입니다</p>
	<p>당신이 가장 좋아하는 꽃은 <jsp:getProperty name="regBean" property="flower" />입니다</p>
	<p>당신이 가장 좋아하는 음악은 <jsp:getProperty name="regBean" property="music" />입니다</p>
	<a href="favoriteForm.jsp">입력화면</a>
</body>
</html>