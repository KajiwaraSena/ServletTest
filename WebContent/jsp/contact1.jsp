<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	String ofice = request.getParameter("ofice");
	String mail = request.getParameter("mail");
	String naiyou = request.getParameter("naiyou");
	String[] magas = request.getParameterValues("maga");
	String qes = request.getParameter("qes");
	%>
	
	<p>氏名 : <%= name %></p>
	<P>会社 : <%= ofice %></P>
	<p>メールアドレス : <%= mail %></p>
	<p>メルマガ : </p>
	<% if(magas != null){ %>	
	<% for(String maga : magas){ %>
    <%=	maga %><br>
	<% }}%>
	<p>お問い合わせ内容:<%= naiyou %></p>
	<p>資料請求：なし	
	
</body>
</html>