<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NSS 나이키 슈즈 샵</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	/* [로그인] 버튼 눌렀을때 처리 이벤트 */
	$(document).ready(function() {

		$("#loginInsert").click(function() {

			$("#loginForm").attr({
				"method" : "POST",
				"action" : "/customer/login/loginForm.do" //여기서 action하는건 무조건 컨트롤러로 넘어감
			});

			$("#loginForm").submit();
		});
		
	});
</script>

<style type="text/css">
/*메인 상단로고*/
.main_logo {
	display: inline-block;
	width: 25%;
	vertical-align: middle;
}

/*우측 상단메뉴 로그인_회원가입_고객센터_장바구니*/
.top_right_nav {
	float: right; /*우측 상단으로 흐르게*/
}

/*메인메뉴*/
.menubar {
	border: none;
	border: 0px;
	margin: 0px;
	padding: 0px;
	font-size: 11px;
	font-weight: bold;
}

.menubar ul {
	background: rgb(109, 109, 109);
	height: 50px;
	list-style: none;
	margin: 0;
	padding: 0;
}

.menubar li {
	float: left;
	padding: 0px;
}

.menubar li a {
	background: rgb(109, 109, 109);
	color: white;
	display: block;
	font-weight: normal;
	line-height: 50px;
	margin: 0px;
	padding: 0px 25px;
	text-align: center;
	text-decoration: none;
}

.menubar li a:hover, .menubar ul li:hover a {
	background: rgb(71, 71, 71);
	color: #FFFFFF;
	text-decoration: none;
}

.menubar li ul {
	background: rgb(109, 109, 109);
	display: none; /* 평상시에는 드랍메뉴가 안보이게 하기 */
	height: auto;
	padding: 0px;
	margin: 0px;
	border: 0px;
	position: absolute;
	width: 200px;
	z-index: 200;
	/*top:1em;
/*left:0;*/
}

.menubar li:hover ul {
	display: block; /* 마우스 커서 올리면 드랍메뉴 보이게 하기 */
}

.menubar li li {
	background: rgb(109, 109, 109);
	display: block;
	float: none;
	margin: 0px;
	padding: 0px;
	width: 200px;
}

.menubar li:hover li a {
	background: none;
}

.menubar li ul a {
	display: block;
	height: 50px;
	font-size: 12px;
	font-style: normal;
	margin: 0px;
	padding: 0px 10px 0px 15px;
	text-align: left;
}

.menubar li ul a:hover, .menubar li ul li:hover a {
	background: rgb(71, 71, 71);
	border: 0px;
	color: #ffffff;
	text-decoration: none;
}

.menubar p {
	clear: left;
}

/*메인메뉴 끝*/

/*상단 검색창*/
.nav_search {
	position: relative;
	width: 224px;
	float: right;
	padding: -40px 10px;
	margin: -16px;
	width: 224px;
}

/*상단 검색 끝*/
* /
	/*메인배너 css */           
.main_banner {
	width: 100%;
	height: 20%;
	position: absolute;
	visibility: hidden;
}
/*푸터 css*/
.footer {
	width: 1250px;
	margin: 0 auto;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
}

a {
	text-decoration: none
} /* a링크 밑줄 제거 */
.footer_top {
	text-decoration: none;
	width: 100%;
	height: 35px;
	margin-top: 0px;
	margin-right: auto;
	margin-bottom: 0px;
	margin-left: auto;
	border-bottom: 2px solid #000;
	border-bottom-width: 2px;
	border-bottom-style: solid;
	border-bottom-color: rgb(0, 0, 0);
}

.address span {
	padding: 0 25px 0 0;
	padding-top: 0px;
	padding-right: 25px;
	padding-bottom: 0px;
	padding-top: 0px;
	padding-right: 22px;
	padding-bottom: 0px;
	padding-left: 0;
}

.copyright {
	text-align: center;
}
</style>
</head>
<body>

	<div id="wrap">
		<header class="main_header" id="main_header">
		<div class="main_logo">
			<h1>
				<a href="#"><img src="../resources/images/logo.jpg" alt="NSS"></a>
			</h1>
			<!-- <h2 class="main_title">나이키 슈즈 샵</h2> -->
		</div>

		<div class="top_right_nav">

			<a class="account_register" href="/customer/login/login.do"> <c:choose>
					<c:when test="${not empty sessionScope.loginSession}">
			${sessionScope.loginSession.customerName}님
								안녕하세요<a id="logout" href="/customer/login/login.do">로그아웃</a></c:when>

					<c:otherwise>로그인/회원가입</c:otherwise>
				</c:choose>
			</a>
			
			<%-- <%=session.getAttribute("loginSession") %> --%>
			
			<a class="customercenter" href="#">고객센터</a> <a class="cart" href="#"><img
				src="cart.jpg" width="25px" height="20px" alt="장바구니"></a>
		</div>

		<div class="nav_search">
			<div class="search_form_container">
				<form class="search_form" action="#" method="get" name="search"
					id="search">
					<p>
						<input type="text" name="keyword" id="keyword" title="검색어입력"
							placeholder="상품을 입력하세요" /> <input type="image"
							src="search_icon.jpg" width="20px" ; height="20px" ; alt="검색" />
					</p>
				</form>
			</div>
		</div>
		<!-- 상단 메뉴 시작 -->
		<div class="menubar">
			<ul>
				<h1>
					<li><a href="#">MEN</a>
						<ul>
							<li><a href="#">런닝</a></li>
							<li><a href="#">라이프 스타일</a></li>
							<li><a href="#">농구</a></li>
							<li><a href="#">축구</a></li>
						</ul></li>
				</h1>
				<h1>
					<li><a href="http://localhost:8080/customer/product/women/wmallList.do" id="current">WOMEN</a>
						<ul>
							<li><a href="http://localhost:8080/customer/product/women/wmrunningList.do">런닝</a></li>
							<li><a href="http://localhost:8080/customer/product/women/wmlifestyleList.do">라이프 스타일</a></li>
						</ul></li>
				</h1>
			</ul>
		</div>
		<!-- 상단메뉴 끝 --> </header>
	</div>
	<!-- 로그인/회원가입/아이디&비밀번호찾기/상품목록/상세페이지 삽입 -->
	<%-- <% String id=""; 
	try{
		//id 세션 속성의 값을 얻어내서 id 변수에 저장
		//인증된 사용자의 경우 id 세션 속성의 값 null 또는 공백이 아님
		id = (String)session.getAttribute("customerID");
	%>

	<%if(id == null ||id.equals("")){//인증되지 않은 사용자 영역 %>
	<div id="status">
		<h2>로그인</h2>
		<form id="loginForm">
			<table>
				<tbody>
					<tr>
						<td><input type="text" id="LoginCustomerID"
							name="LoginCustomerID" placeholder="아이디"></td>
					</tr>

					<tr>
						<td><input type="password" id="LoginCustomerPW"
							name="LoginCustomerPW" placeholder="비밀번호"></td>
					</tr>

					<tr>
						<td><input type="button" value="로그인" name="loginInsert"
							id="loginInsert"></td>
					</tr>

					<tr>
						<td><a href="#">아이디 찾기</a></td>
						<td><a href="#">비밀번호 찾기</a></td>
						<td><a href="#">관리자페이지</a></td>
					</tr>

					<tr>
						<td><a href="/customer/registerForm.do"><input
								type="button" value="회원가입">회원가입</a></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
	<%}else{//인증된 사용자 영역 %>
	<div id="status">
		<h2>로그인</h2>
		<form id="loginForm">
			<table>
				<tbody>
					<tr>
						<td>
						<b></b>님 반갑습니다.
						</td>
					</tr>

					<tr>
						<td><input type="button" value="로그아웃" name="loginOut"
							id="loginOut"></td>
					</tr>

					<tr>
						<td><a href="#">아이디 찾기</a></td>
						<td><a href="#">비밀번호 찾기</a></td>
						<td><a href="#">회원정보변경</a></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
	<%}}catch(Exception e){e.printStackTrace();}%> --%>












	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<!-- 로그인/회원가입/아이디&비밀번호찾기/상품목록/상세페이지 삽입  끝-->
	<div class="footer">
		<div class="footer_top">
			<span> <a href="#">홈</a></span> <span> <a href="#">회사소개</a></span> <span>
				<a href="#">이용약관</a>
			</span> <span> <a href="#">개인정보약관</a></span>
		</div>

		<p class="address">
			<span>상호명 : ㈜ NSS</span> <span>대표자 : 서경호</span> <span>사업자 등록
				번호 :123-45-31955</span> <span>통신판매업 신고 : 2017-서울성동-02398 </span> <span>고객센터
				: 070-123-4567</span><span>개인정보책임자:김인선</span><br> <span>주소 :
				서울특별시 성동구 무학로2길 54 신방빌딩 5층 7호 </span> <span>예금주 : ㈜ NSS </span> <span>미래은행
				: 12-345-6789-12</span>
		</p>
		<br> <br>
		<p class="copyright">
			Copyright &copy; 2017 <strong>㈜ NSS</strong> All Rights Reserved.
		</p>
	</div>

</body>
</html>