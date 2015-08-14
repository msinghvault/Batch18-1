<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--This is JSP COMMENT--%>
	<!-- This is HTML COMMENT -->
	<%="Hey Guys"%>
	<%=getHTML()%>
	<%
		out.println("Hello World");
	 %>
	<%! 
		int value = 89;
	%>
	<%!
		
		private String getHTML(){
			return "<H1>" + new java.util.Date();
		}
	 %>
	 
	 
</body>
</html>