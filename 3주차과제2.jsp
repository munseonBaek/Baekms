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
            personality = "�������̰� ������ ������ �ֽ��ϴ�.";
        } else if ("B".equals(bloodtype)) {
            personality = "â�����̰� �����ο� ��ȥ�� ���� ��찡 �����ϴ�.";
        } else if ("O".equals(bloodtype)) {
            personality = "�������̰� �������� ������ ������, ģ���ϰ� �������� ���� �� �ֽ��ϴ�.";
        } else if ("AB".equals(bloodtype)) {
            personality = "�پ��� Ư���� ��ȭ�Ӱ� ���� ��찡 ���� ��ȭ�����ϸ� ���뼺�� �ֽ��ϴ�.";
        } else {
            personality = "�� �� ���� �������Դϴ�.";
        }
    %>
    
    <h1><%= bloodtype %>���� ����</h1>
    <p><%= personality %></p>
    
    <a href="3��������1.jsp">�ٽ� �����ϱ�</a>
</body>
</html>