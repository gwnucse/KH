<%@page import="kh.java.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Member m = (Member) session.getAttribute("member");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MVC1 프로젝트</h1>
	<hr>
	<%
		if (m != null) {
	%>
	<p><%=m.getMemberName()%></p>
	<%
		}
	%>
	<h3>
		<a href="/views/member/login.jsp">로그인 페이지</a>
	</h3>
</body>
</html>