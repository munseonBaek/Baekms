<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String movie = request.getParameter("movie");
	String star = request.getParameter("star");
	String review = request.getParameter("review");
	%>
	<p>
		재미있게 본 영화 :
		<%=movie%>
	<p>
		평점 :
		<%=star%>
	<p>
		소감 :
		<%=review%>
</body>
</html>