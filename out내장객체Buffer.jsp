<%@ page buffer="5kb" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int totalBuffer = out.getBufferSize();
	int remainBuffer = out.getRemaining();
	int useBuffer = totalBuffer - remainBuffer;
	%>
	<strong>현재 페이지 Buffer 상태</strong>
	<br> 출력 Buffer 전체 크기 :<%=totalBuffer%>byte
	<br> 남은 Buffer의 크기 :
	<%=remainBuffer%>byte
	<br> 현재 Buffer의 사용량:<%=useBuffer%>byte
	<br>
</body>

</html>