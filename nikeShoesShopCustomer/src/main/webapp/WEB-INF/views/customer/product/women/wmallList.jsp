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
		$("#priceSort").on("change", function() {
			$(this).val("heighPrice").prop("selected", false);
			alert("높은가격선택");
		});
	});
</script>
<style type="text/css">
.sidebar_menu {
	color: black; 
	display: block; 
	float:left;
	padding: 12px; 
	text-decoration: none; 
}
.sidebar_menu  a {
    color: black; 
    display: block; 
    padding: 12px;
    text-decoration: none;
}

.men_list{
	padding-left:300px;
	padding-top:40px;
}
</style>
</head>
<body>
	<h5>여성 전체</h5>
	<div id="sort">
		<select id="priceSort" name="priceSort">
			<option value="all">전체</option>
			<option value="heighPrice">높은가격순</option>
			<option value="rowPrice">낮은가격순</option>
		</select>

	</div>
	<hr>
	<div class="sidebar_menu">
		<section>
			<article>
				<a href="http://localhost:8080/customer/product/women/wmallList.do" class="active">전체</a> 
				<a href="http://localhost:8080/customer/product/women/wmrunningList.do">런닝화</a> 
				<a href="http://localhost:8080/customer/product/women/wmlifestyleList.do">라이프스타일</a> 
	
			</article>
		</section>
		</div>
		<div class="productContent">
		<section>
		<article class="men_list">
		<table>
			<c:choose>
				<c:when test="${not empty wmallList}">
					<c:forEach var="wmall" items="${wmallList }" varStatus="status">
						<tr>
							<td>${wmall.productName}</td>
							<td>${wmall.productPrice}</td>
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