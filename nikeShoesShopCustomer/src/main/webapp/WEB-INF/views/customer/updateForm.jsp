<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function() {
	/* 저장 버튼 클릭 시 처리 이벤트 */

	$("#customerUpdate").click(function() {//수정버튼을 눌렀을때
		//입력값 체크
		/* if (!chkSubmit($('#customerPW'), "비밀번호를"))
			return;

		else if (!chkSubmit($('#customerCellPhone'), "전화번호를"))
			return;

		else if (!chkSubmit($('#customerEMail'), "이메일을"))
			return;
		
		else if (!chkSubmit($('#customerBirth'), "생년월일을"))
			return;
		
		else if (!chkSubmit($('#customerAccept'), "회원동의여부를"))
			return;
 */
		
			$("#updateForm").attr({
				"method" : "POST",
				"action" : "/customer/customerUpdate.do"
			});
			
			$("#updateForm").submit();
		
	});
	
});

</script>
</head>
<body>
	<form id="updateForm">
	<input type="hidden" id="customerNO" name="customerNO" value="13">
		<table>
			<tbody>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">&nbsp;회원아이디</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerID" name="customerID" ></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">회원비밀번호&nbsp;</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="password" id="customerPW" name="customerPW"></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">회원이름&nbsp;</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerName" name="customerName" ></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">회원전화번호&nbsp;</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerCellPhone" name="customerCellPhone"></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">회원이메일&nbsp;</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="email" id="customerEMail" name="customerEMail"></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">회원생년월일&nbsp;</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerBirth" name="customerBirth"></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">회원성별&nbsp;</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerGender" name="customerGender"
						></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">회원동의여부</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerAccept" name="customerAccept"></td>
				</tr>
			</tbody>
		</table>
	</form>
	<button type="submit" id="customerUpdate">수정</button>

</body>
</html>