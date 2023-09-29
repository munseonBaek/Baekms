<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="regBean" class="ch04.ProductProcess" scope="page" />
	<jsp:setProperty name="regBean" property="productid" />
	<jsp:setProperty name="regBean" property="name" />
	<jsp:setProperty name="regBean" property="unitPrice" />
	<jsp:setProperty name="regBean" property="description" />
	<jsp:setProperty name="regBean" property="manufacturer" />
	<jsp:setProperty name="regBean" property="category" />
	<jsp:setProperty name="regBean" property="unitsInStock" />
	<jsp:setProperty name="regBean" property="condition" />


	<p>상품 코드 : <jsp:getProperty name="regBean" property="productid" /></p>
	<p>상품명 : <jsp:getProperty name="regBean" property="name" /></p>
	<p>가격 : <jsp:getProperty name="regBean" property="unitPrice" /></p>
	<p>상세 정보 : <jsp:getProperty name="regBean" property="description" /></p>
	<p>제조사 : <jsp:getProperty name="regBean" property="manufacturer" /></p>
	<p>분류 : <jsp:getProperty name="regBean" property="category" /></p>
	<p>재고 수 : <jsp:getProperty name="regBean" property="unitsInStock" /></p>
	
	
	<p>상태 : <jsp:getProperty name="regBean" property="condition" /></p>
	
	<a href="addProduct.jsp">입력화면</a>
</body>
</html>