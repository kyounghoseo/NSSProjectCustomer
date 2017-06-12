<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="tag" uri="/WEB-INF/tld/custom_tag.tld"%>
<c:if test="${csrfError !=null}">
	<c:remove var="csrfError" />
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NSS(나이키 슈즈 샵)</title>
<link rel="stylesheet" type="text/css" href="../resources/css/main.css" />
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
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
			<a class="account_register" href="#">로그인/회원가입</a> <a
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
		
		<!-- 검색페이지 -->
		<div class="searchHistory_container">
		<h2 class="search_keyword">전체</h2>
		
		<table summary="정렬">
			<select id="search_filter" name="search_filer">
				<option value="all">전체</option>
				<option value="rowPrice">낮은가격순</option>
				<option value="heighPrice">높은가격순</option>
			</select>
		</table>


</div>
		<!-- 푸터 -->

	</div>
</body>
</html>