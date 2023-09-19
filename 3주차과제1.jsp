<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>혈액형 별 성격</title>
</head>
<body>
    <form action="3주차과제2.jsp" method="post">
       <p>혈액형별로 성격 테스트</p>
       <p>당신의 혈액형은?</p>
        <input type="radio" name="bloodtype" value="A"> A형<br>
        <input type="radio" name="bloodtype" value="B"> B형<br>
        <input type="radio" name="bloodtype" value="O"> O형<br>
        <input type="radio" name="bloodtype" value="AB"> AB형<br>
        <input type="submit" value="보내기">
    </form>
</body>
</html>