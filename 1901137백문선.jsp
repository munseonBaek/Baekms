<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
	<h1>구구단 출력</h1>
	<%
	for(int i=2; i<=9; i++){
		for(int j=1; j<=9; j++){
	%>	
		<%= i%> * <%= j%> = <%= i*j %><br>
	
	<%
		}
		out.println("<br><br>");
	}
		
	%>
	
</body>
</html>