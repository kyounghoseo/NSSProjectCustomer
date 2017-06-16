<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 재설정 창</title>
<!-- 비밀번호 찾는 정보 입력하는 창 -->
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	/* [변경완료] 버튼 눌렀을때 처리 이벤트 */
	$(document).ready(function() {

		$("#PWUpdate").click(function() {//비밀번호 찾기에서 변경완료 버튼을 눌렀을 때

			$("#pwConfirmForm").attr({
				"method" : "POST",
				"action" : "/login/pwConfirm.do" //여기서 action하는건 무조건 컨트롤러로 넘어감
			});

			$("#pwConfirmForm").submit();
		});
	});

	/* [취소] 버튼 눌렀을때 처리 이벤트 */
	$(document).ready(function() {

		$("#PWReset").click(function() {//비밀번호 찾기에서 취소 버튼을 눌렀을 때

			$("#pwConfirmForm").attr({
				"method" : "POST",
				"action" : "/login/pwSearch.do" //여기서 action하는건 무조건 컨트롤러로 넘어감
			});

			$("#pwConfirmForm").submit();
		});
	});
</script>
</script>

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
	<form id="pwConfirmForm">
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
					<td><input type="button" value="변경완료" name="PWUpdate"
						id="PWUpdate"></td>
					<td><input type="button" value="취소" name="PWReset"
						id="PWReset"></td>
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