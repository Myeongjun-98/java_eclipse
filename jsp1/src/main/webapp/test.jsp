<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%!		//	선언문	-	변수, 메서드선언, 클래스정의
    int age = 0;
    int[] arr = new int[] {10, 20, 30, 40, 50, 60};
    %>
    <%		//	스크립틀릿
	age = 25;    
    %>
    <%=		// 표현식
    		age
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- html주석 -->
	<%-- jsp주석 --%>

	<h1> <%=age %></h1>
	
	<ul>
		<%
			for(int i = 0; i < arr.length; i++){
			/* 	out.print("<li>" + arr[i] + "</li>");
			} */
		%>
			<li> <%=arr[i] %></li>
			<%} %>
	</ul>
	
	
	
	
</body>
</html>