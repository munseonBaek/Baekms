<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset style="width: 400px">
		<legend>영화 평점</legend>
		<form action="form연습문제2-2.jsp" name="member" method="post">
		<p>
			재미있게 본 영화 : <br>
		<input type="text" name="movie">
		<p>
			평점 :
		<hr>
		<input type="radio" name="star" value="★★★★★"> ★★★★★ <br>
		<input type="radio" name="star" value="★★★★☆"> ★★★★☆ <br>
		<input type="radio" name="star" value="★★★☆☆"> ★★★☆☆ <br>
		<input type="radio" name="star" value="★★☆☆☆"> ★★☆☆☆ <br>
		<input type="radio" name="star" value="★☆☆☆☆"> ★☆☆☆☆
		<hr>
		<p>
			소감 :
		<textarea name="review" rows="5" cols="50"></textarea>
		<div style="text-align: center;">
		<hr>
		<p>
			<input type="submit" value="제출하기">
			<input type="reset" value="다시작성">
		</div>
		</form>
	</fieldset>
</body>
</html>