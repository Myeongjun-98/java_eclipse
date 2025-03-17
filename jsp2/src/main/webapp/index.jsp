<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOVE</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<link rel = "icon" href="./static/images/loveicon.ico">
<link rel = "stylesheet" href = "./static/css/default.css">
<link rel = "stylesheet" href = "./static/css/main.css">

</head>
<body>

	<div id = "wrap">
	<%@ include file = "./header.jsp" %>
	
	<div id = "main"	>
		<div id = "slide-wrap">
			<div class = "slide-img">
				<img src = "https://picsum.photos/1000/400?random=1" alt = "">
			</div>
			<p class = "arrow">
				<span class = "arrow-left">
				<i class="bi bi-caret-left"></i>
				</span>
				<span class = "arrow-right">
				<i class="bi bi-caret-right"></i>
				</span>
			</p>
		</div>
		<div id = "content-wrap">
			<img src = "https://picsum.photos/300/300?random=2" alt = "">
			<img src = "https://picsum.photos/300/300?random=3" alt = "">
			<img src = "https://picsum.photos/300/300?random=4" alt = "">
			<img src = "https://picsum.photos/300/300?random=5" alt = "">
			<img src = "https://picsum.photos/300/300?random=6" alt = "">
			<img src = "https://picsum.photos/300/300?random=7" alt = "">
			<img src = "https://picsum.photos/300/300?random=8" alt = "">
			<img src = "https://picsum.photos/300/300?random=9" alt = "">
			<img src = "https://picsum.photos/300/300?random=10" alt = "">
		</div>
	</div>

	<%@ include file = "./footer.jsp" %>
	</div>
	
</body>
</html>