<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset style="width: 300px">
		<legend>개인 정보</legend>
		<form action="#" name="member" method="post"></form>
		<p>
			닉네임 : <input type="text" name="nickname"> <input
				type="button" value="중복검사">
		<p>
			성별 : <input type="radio" name="gender" value="남" checked> 남 <input
				type="radio" name="gender" value="여"> 여
		<p>
			게임장르 : <input type="checkbox" name="game1">액션 <input
				type="checkbox" name="game2">퍼즐 <input type="checkbox"
				name="game3">전략 <input type="checkbox" name="game4">리듬
		<hr>
		<p>
			혈액형 : <select name="bloodtype">
				<option value="choose">=== 선택 ===</option>
				<option value="bloodA">A 형</option>
				<option value="bloodB">B 형</option>
				<option value="bloodO">O 형</option>
				<option value="bloodAB">AB 형</option>
				<option value="bloodNull">모름</option>
			</select>
		<hr>
		<p>
			자기소개 :
			<textarea name="comment" cols="50" rows="5" placeholder=""></textarea>
		<div style="text-align: center;">
		<hr>
		<p>
			<input type="submit" value="제출하기">
			<input type="reset" value="다시작성">
		</div>
</body>
</html>