<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "../servlet/contact" method = "post">
	<p>氏名：<input type="text" name="name" required="required"></p>
	<p>会社：<input type="text" name="ofice" required="required"></p>
	<p>メールアドレス：<input type="text" name="mail" required="required"></p>
	<p>お問い合わせ内容：<textarea name="naiyou" cols="30" rows="5"></textarea></p>
	メルマガ種類<br>
	<form action ="checkbox" method ="post">
	<input type="checkbox" name ="maga" value ="総合案内">総合案内
	<input type="checkbox" name ="maga" value ="セミナー案内">セミナー案内
	<input type="checkbox" name ="maga" value ="求人採用情報">求人採用情報<br>
	資料請求希望<br>
	Yes<input type="radio" name="qes" value="Yes" checked>
	No<input type="radio" name="qes" value="No">
	<p><input type="submit" value="送信"></p>
	</form>
</body>
</html>