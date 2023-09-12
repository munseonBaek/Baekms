<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%--첫 utf-8은 jsp컨테이너한테 알려줌(예전 jsp버전을 위해) 두번째 utf-8은 최근 jsp버전을 위해 --%>
<%-- "<%@" 여기서 @는 디렉티브 태그 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%--이 utf-8은 웹브라우저한테 알려줌--%>
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<%!String greeting = "smKeab";
	String tagline = "어서오시고";%>
	<nav class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="./welcome.jsp">Home</a>
	</nav>
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1 class="display-4"><%=greeting%></h1>
		</div>
	</div>
	<main role="main">
		<div class="container">
			<div class="text-center">
				<h3>
					<%=tagline%>
				</h3>
				<%
               Date day = new java.util.Date();
               String am_pm;
               int hour = day.getHours();
               int minute = day.getMinutes();
               int second = day.getSeconds();
               if(hour / 12 == 0) {
                  am_pm = "AM";
               } else {
                  am_pm = "PM";
                  hour = hour-12;
               }
               String CT = hour + ":" + minute + ":" + second + " " + am_pm;
               out.println("현재 접속 시각: "+CT+"\n");
            %>
			</div>
		</div>
		<hr>
	</main>
	<footer class="container">
		<%@ include file="welcome_footer.jsp"%>

	</footer>
</body>
</html>