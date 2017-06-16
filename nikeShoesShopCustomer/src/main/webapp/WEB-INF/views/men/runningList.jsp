<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>남성 런닝화</title>
<script type="text/javascript"src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(document).ready(function(){
				
		$("#priceSort").change(function(){
			if("#highPrice").val()==''ASC"
		});
	
});



</script>

</head>
<body>
	남성 런닝화
	<select id="priceSort" name="priceSort">
	<option value="all">전체</option>
	<option value="heighPrice" >높은가격순</option>
	<option value="rowPrice">낮은가격순</option>
	</select>
	<hr>
	<table>
		<c:choose>
			<c:when test="${not empty runningList}">
				<c:forEach var="running" items="${runningList }" varStatus="status">
					<tr>
						<td>${running.productName}</td>
						<td>${running.productPrice}</td>
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
</body>
</html>