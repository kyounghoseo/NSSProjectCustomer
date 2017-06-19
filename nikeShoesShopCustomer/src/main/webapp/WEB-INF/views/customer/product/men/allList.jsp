<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NSS 나이키 슈즈 샵</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
	
	
<script type="text/javascript">
	$(document).ready(function() {
		
		$("#priceSort1").on("change", function() {
			alert($("#priceSort1").val());
			$("#priceSort").val($("#priceSort1").val());
			$("#sort_form").attr({
				"method" : "get",
				"action" : "/customer/product/men/allList.do"
			});
			$("#sort_form").submit();
		});

		//상세페이지 이동
		function goDetail(productNo) {
			location.href = "/product/men/allDetail.do?productNo=" + productNo;
		}

	});
</script>
<style type="text/css">
.sidebar_menu {
	color: black;
	display: block;
	float: left;
	padding: 12px;
	text-decoration: none;
}

.sidebar_menu  a {
	color: black;
	display: block;
	padding: 12px;
	text-decoration: none;
}

.men_list {
	padding-left: 300px;
	padding-top: 40px;
}
</style>
</head>
<body>
	<h5>전체</h5>
	 ${priceSort}
	<div id="sort">
	<form name="sort_form" id="sort_form">
		<input type="hidden" name="priceSort" id="priceSort" value="" />
	</form>
		<select id="priceSort1" name="priceSort1">
			<option value="all" <%-- ${priceSort.eq("all")? "selected":""} --%>>전체</option>
			<option value="heighPrice" <%-- ${priceSort.eq("heighPrice")? "selected":""} --%>>높은가격순</option>
			<option value="lowPrice" <%-- ${priceSort.eq("lowPrice")? "selected":""} --%>>낮은가격순</option>
		</select>

	</div>
	<hr>
	<div class="sidebar_menu">
		<section>
			<article>
				<a href="http://localhost:8080/customer/product/men/allList.do"
					class="active">전체</a> <a
					href="http://localhost:8080/customer/product/men/runningList.do">런닝화</a>
				<a
					href="http://localhost:8080/customer/product/men/lifestyleList.do">라이프스타일</a>
				<a
					href="http://localhost:8080/customer/product/men/basketballList.do">농구화</a>
				<a href="http://localhost:8080/customer/product/men/soccerList.do">축구화</a>
			</article>
		</section>
	</div>
	<div class="productContent">
		<section>
			<article class="men_list">
				<table>
					<c:choose>
						<c:when test="${not empty allList}">
							<c:forEach var="all" items="${allList }" varStatus="status">
								<tr>
									<td><a href="javascript:goDetail(${all.productNo})">${all.productName}</a></td>
									<td>${all.productPrice}</td>
								</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td>등록된 상품이 없다</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</table>
			</article>
		</section>
	</div>
</body>
</html>