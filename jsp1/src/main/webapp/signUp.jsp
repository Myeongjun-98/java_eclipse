<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection, java.sql.Statement, java.sql.DriverManager, java.sql.ResultSet"%>
<%
String myId = request.getParameter("id");
String myPw = request.getParameter("pw");
String myBirth = request.getParameter("birth");
String myEmail = request.getParameter("email");

// 데이터베이스 저장하기 - 하지만 아이디가 중복이면 저장안함
Connection conn = null;


	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user = "mjk";
		String pass = "1234";
		String url="jdbc:mysql://localhost:3306/mjk";
		conn = DriverManager.getConnection(url,user,pass);
		
	}catch(Exception e){
		System.out.println("드라이버 로드 실패!");
		e.printStackTrace();
	}

// 회원가입양식에 입력한 내용을 테이블에 저장할것이다.
// 그 전에 아이디 중복 확인

	ResultSet rs = null;
	Statement st = null;	

	String sql = "select * from member1 where member_id = '" + myId + "'";
	try{
		st = conn.createStatement();
		rs = st.executeQuery(sql);
		
		if(rs.next()){			// 참 = 아이디중복, 거짓 = 아이디중복없음
			// 아이디가 중복이라면 회원가입 다시하게 해 줄 것
			// 다시 회원가입 양식 페이지로 이동해야된다.
			// 이동시키는 방법으로 javascript 또는 내장객체를 사용하는 방법이 있다.
			%>
<!-- 				<script> -->
<!--// 					history.back();					// 이전 정보를 남김 -->
<!-- 					alert("아이디가 중복이에요"); -->
<!-- 					location.href="main.jsp";		// 새로운페이지를 엶 -->
<!-- 				</script> -->
			<%
				response.sendRedirect("main.jsp");			
				return;
		}
		
	}catch(SQLException e){
		System.out.println("아이디 중복 확인 조회 실패");
	}
	
	// 아이디 중복이 아니니까 회원가입 내용 테이블에 저장 시키기
	PreparedStatement pt = null;
	
	sql = "insert into member1(member_id, email, password, birth) values(?,?,?,?)";
	try{
		pt = conn.prepareStatement(sql);
		pt.setString(1, myId);
		pt.setString(2, myEmail);
		pt.setString(3, myPw);
		pt.setString(4, myBirth);
		
		pt.executeUpdate();	// 쿼리문과 채워진 데이터를 보내기

	}catch(SQLException e){
		System.out.println(" 회원가입 테이블 저장 실패 ");
		e.printStackTrace();
	}
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 회원가입 완료 </h2>
	<h3> 회원 가입 내용 </h3>
	<ul>
		<li>아이디 : <%= myId %></li>
		<li>비밀번호 : <%= myPw %></li>
		<li>생년월일 : <%= myBirth %></li>
		<li>이메일 : <%= myEmail %></li>
	</ul>
	
	<a href = "main.jsp"> Home </a>
	
</body>
</html>