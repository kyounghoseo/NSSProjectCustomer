<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
<!-- 비밀번호 찾는 정보 입력하는 창 -->
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	/* [비밀번호 재설정] 버튼 눌렀을때 처리 이벤트 */
	$(document).ready(function() {

		$("#PWInsert").click(function() {//비밀번호 찾기에서 비밀번호찾기 버튼을 눌렀을 때

			$("#pwSearchForm").attr({
				"method" : "POST",
				"action" : "/login/pwConfirm.do" //여기서 action하는건 무조건 컨트롤러로 넘어감
			});

			$("#pwSearchForm").submit();
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
					<a href="#"><img src="logo.jpg" alt="NSS"></a>
				</h1>
				<!-- <h2 class="main_title">나이키 슈즈 샵</h2> -->
			</div>

			<div class="top_right_nav">

				<a class="account_register" href="#">로그인/회원가입</a> <a
					class="customercenter" href="#">고객센터</a> <a class="cart" href="#"><img
					src="cart.jpg" width="25px" ; height="20px" ; alt="장바구니"></a>
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
						<li><a href="#" id="current">WOMEN</a>
							<ul>
								<li><a href="#">런닝</a></li>
								<li><a href="#">라이프 스타일</a></li>
							</ul></li>
					</h1>
				</ul>
			</div>
			<!-- 상단메뉴 끝 -->
		</header>
	</div>
	<!-- 로그인/회원가입/아이디&비밀번호찾기/상품목록/상세페이지 삽입 -->
	<form id="pwSearchForm">
		<p>비밀번호 찾기</p>
		<table>
			<tbody>
				<tr>
					<td><label for="IDCustomerName">이름</label></td>
					<td><input type="text" id="IDCustomerName"
						name="IDCustomerName" placeholder="이름을 입력해 주세요"
						required="required"></td>
				</tr>

				<tr>
					<td><label for="LoginCustomerID">아이디</label></td>
					<td><input type="text" id="LoginCustomerID"
						name="LoginCustomerID" placeholder="아이디를 입력해 주세요"
						required="required"></td>
				</tr>

				<tr>
					<td><label for="IDCustomerEMail">이메일</label></td>
					<td><input type="Email" id="IDCustomerEMail"
						name="IDCustomerEMail" placeholder="이메일을 입력해 주세요"
						required="required"></td>
				</tr>

				<tr>
					<td><input type="button" value="비밀번호 재설정" name="PWInsert"
						id="PWInsert"></td>
				</tr>
			</tbody>
		</table>
	</form>
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