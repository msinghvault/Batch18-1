<%@ page import="java.util.Date,java.util.List" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#66CCFF">
<%
	String [] jay = {"Jayram","Tutor"};
	String [] vandana = {"Vandana","Student"};
	String [] agni = {"Agni","Student"};
	
	String humans[][] = {jay,vandana,agni};
 %>
	<table border="1">
		<thead><tr><td>Name</td><td>Occupation</td></tr> </thead>
		
		<%
			for(int i = 0 ; i < humans.length ; i ++) {
				String human [] = humans[i];
		%>		
				<tr align="left">
		<%		
				for(int j = 0 ; j < human.length; j++) {
		%>		
					<td><%=human[j]%></td>
		<%			
				}
		%>		
				</tr>
		<%		
			}
		
		 %>
		<%-- <%
			for(int i = 0 ; i < humans.length ; i ++) {
				String human [] = humans[i];
				out.println("<tr>");
				for(int j = 0 ; j < human.length; j++) {
					out.println("<td>"+human[j]+"</td>");
				}
				out.println("</tr>");
			}
		
		 %> --%>
		<%-- <tr><td><%=jay[0]%></td><td><%=jay[1]%></td></tr> --%>
	</table>
</body>
</html>