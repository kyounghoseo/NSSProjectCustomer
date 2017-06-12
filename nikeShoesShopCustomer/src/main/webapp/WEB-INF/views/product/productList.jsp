<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="tag" uri="/WEB-INF/tld/custom_tag.tld"%>
<c:if test="${csrfError !=null}">
	<c:remove var="csrfError" />
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
<link rel="stylesheet" type="text/css" href="../resources/css/main.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		/*검색 후 검색 대상과 검색 단어 출력*/

		if ("<c:out value='${data.keyword}' />" != "") {
			$("#keyword").val("<c:out value='${data.keyword}' />");
			$("#search").val("<c:out value='${data.search}' />");

		}
		/*한페이지에 보여줄 레코드 수 조회 후 선택한 값 그대로 유지하기 위한 설정*/
		if ("<c:out value='${data.pageSize}' />" != "") {
			$("#pageSize").val("<c:out value='${data.pageSize}' />");
		}

		/*검색 대상이 변경될 때마다 처리 이벤트*/
		$("#search").change(function() {
			if ($("#search").val() == "all") {
				$("#keyword").val("글 목록 전체 조회");
			} else if ($("#search").val() != "all") {
				$("#keyword").val("");
				$("#keyword").focus();
			}
		});

		/*검색 버튼 클릭 시 처리 이벤트*/
		$("#searchBtn").click(function() {
			location.href = "/customer/product/searchResult.do";
		});

		/* 한페이지에 보여줄 레코드수를 변경될 때마다 처리 이벤트 */
		$("#pageSize").change(function() {
			goPage(1);
		});

		//엑셀 파일 다운로드 처리 이벤트
		$("#excelDown").click(function() {
			$("#f_search").attr({
				"method" : "get",
				"action" : "/board/boardExcel.do"
			});
			$("#f_search").submit();
		});

		/* 제목 클릭시 상세 페이지 이동을 위한 처리 이벤트 */
		$(".goDetail").click(function() {
			var b_num = $(this).parents("tr").attr("data-num");
			$("#b_num").val(b_num);
			console.log("글번호 : " + b_num);
			// 상세 페이지로 이동하기 위해 form 추가 (id : detailForm)
			$("#detailForm").attr({
				"method" : "get",
				"action" : "/board/boardDetail.do"
			});
			$("#detailForm").submit();
		});

		//글쓰기 버튼 클릭시 
		$("#insertFormBtn").click(function() {
			location.href = "/customer/product/insertForm.do";
		});
	});

	//정렬 버튼 클릭시 처리 함수
	function setOrder(order_by) {
		$("#order_by").val(order_by);
		if ($("#order_sc").val() == 'DESC') {
			$("#order_sc").val('ASC');
		} else {
			$("#order_sc").val('DESC');
		}
		goPage(1);
	}

	/*검색과 한 페이지에 보여줄 레코드 수 처리 및 페이징을 위한 실질적인 처리 함수*/
	function goPage(page) {
		if ($("#search").val() == "all") {
			$("#keyword").val("");
		}
		$("#page").val(page);
		$("#f_search").attr({
			"method" : "get",
			"action" : "/board/boardList.do"
		});
		$("#f_search").submit();
	}
</script>

</head>
<body>
	<div id="wrap">
		<header class="main_header" id="main_header">
			<h5>헤더</h5>
			<div class="main_logo">
				<a href="#"><img src="../resources/images/logo.jpg" alt="NSS로고"></a>
				<!-- <h2 class="main_title">나이키 슈즈 샵</h2> -->
			</div>

			<div class="top_right_nav">
				<input type="button" value="상품등록" id="insertFormBtn"> <a
					class="account_register" href="#">로그인/회원가입</a> <a
					class="customercenter" href="#">고객센터</a> <a class="cart" href="#"><img
					src="../resources/images/cart.jpg" width="25px" ; height="20px"
					; alt="장바구니"></a>
			</div>
			<div class="nav_search">
				<div class="search_form_container">
					<form class="search_form" action="#" method="get" name="search"
						id="search">
						<p>
							<input type="text" name="keyword" id="keyword" title="검색어입력"
								placeholder="상품을 입력하세요" /> <input id="searchBtn" type="image"
								src="../resources/images/search_icon.jpg" width="20px"
								; height="20px" ; alt="검색" />
						</p>
					</form>
				</div>
			</div>
			<!-- 상단 메뉴 시작 -->
			<div class="menubar" id="menubar">

				<ul>
					<li><a href="#">MEN</a>
						<ul>
							<li><a href="#">런닝</a></li>
							<li><a href="#">라이프 스타일</a></li>
							<li><a href="#">농구</a></li>
							<li><a href="#">축구</a></li>
						</ul></li>

					<li><a href="#" id="current">WOMEN</a>
						<ul>
							<li><a href="#">런닝</a></li>
							<li><a href="#">라이프 스타일</a></li>
						</ul></li>

				</ul>
			</div>
		</header>
		<!-- 상단메뉴 끝 -->

		<hr>
		<!-- 메인 상단배너 시작 -->
		<div id="content">
			<div class="content_banner" id="content_banner">
				<h5>본문</h5>

				<article class="content_banner1">
					<h5>메인배너</h5>
					<div class="banner1">
						<h5>동영상 광고</h5>
						<video id="top_banner" autoplay="true" loop="loop" muted="muted"
							preload="true">
							<source src="../resources/video/nike_mov.mp4" type="video/mp4">
						</video>
					</div>
				</article>

			</div>
		</div>
		<hr>
		<!-- 상단배너 끝 -->
		<!-- 신상품 목록 -->



		<!-- 데이터 출력 -->

		<div id="newarrival_container">
			<article id="newProduct">
				<h2>신상품</h2>
				<hr>
				<ul class="prod-list">
					<li><a href="#"><img src="${product.productMainImage}"></a>
						<div class="caption">
							<p>${product.productName}</p>
							<p>${product.productPrice }</p>
						</div></li>
				</ul>
			</article>
		</div>
               <!-- 베스트 상품 -->
		<div id="bestProduct_container">
			<article id="bestProduct">
			<h2>베스트 상품</h2>
				<hr>
				<ul class="prod-list">
					<li><a href="#"><img src="new.jpg"></a>
						<div class="caption">
							<p>상품 1</p>
							<p>상품 1 설명 텍스트</p>
							<p>가격 : 1원</p>
						</div></li>
					<li><img src="new.jpg">
						<div class="caption">
							<p>상품 1</p>
							<p>상품 2 설명 텍스트</p>
							<p>가격 : 1원</p>
						</div></li>
				</ul>
			</article>
		</div>
		<!-- 베스트 상품 끝 -->

		<!-- 빈공간 테스트 -->
		<br> <br> <br> <br> <br> <br>
		<!-- 빈공간 테스트  끝-->

		<!-- 푸터 -->

	</div>


</body>
</html>