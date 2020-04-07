<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	String user = request.getParameter("user");
%>
	
	<h1> <%= user %>의 홈페이지 </h1>
	<%-- http://localhost:8080/my_web/?user=홍길동 에서 ?user=홍길동은 쿼리 스트링--%>

</body>
</html>