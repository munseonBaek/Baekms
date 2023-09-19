<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
        String bloodtype = request.getParameter("bloodtype");
        String personality = "";
        
        if ("A".equals(bloodtype)) {
            personality = "조직적이고 성실한 경향이 있습니다.";
        } else if ("B".equals(bloodtype)) {
            personality = "창의적이고 자유로운 영혼을 가진 경우가 많습니다.";
        } else if ("O".equals(bloodtype)) {
            personality = "안정적이고 현실적인 경향이 있으며, 친절하고 적응력이 좋을 수 있습니다.";
        } else if ("AB".equals(bloodtype)) {
            personality = "다양한 특성을 조화롭게 갖춘 경우가 많아 변화무쌍하며 융통성이 있습니다.";
        } else {
            personality = "알 수 없는 혈액형입니다.";
        }
    %>
    
    <h1><%= bloodtype %>형의 성격</h1>
    <p><%= personality %></p>
    
    <a href="3주차과제1.jsp">다시 선택하기</a>
</body>
</html>