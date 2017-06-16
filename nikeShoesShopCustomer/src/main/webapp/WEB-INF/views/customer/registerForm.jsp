<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
	$(document).ready(function() {

		/* [가입] 버튼 눌렀을때 처리 이벤트 */
		$("#customerInsert").click(function() {

			$("#registerForm").attr({
				"method" : "POST",
				"action" : "/customer/customerInsert.do"
			});

			$("#registerForm").submit();
			
		});
		
		/* [취소] 버튼 눌렀을 때 처리 이벤트 */
		$("#customerCancel").click(function() {
			location.reload(true)
		});
		
		/* 사용자가 입력 폼에 입력한 상황을 체크 */
		function checkRegister(){
			status = true;
			
		if(!$("#customerID").val()){//아이디를 입력하지 않으면 수행
			alert("아이디를 입력하세요");
			$("#customerID").focus();
			status = false;
			return false; //사용자가 서비스를 요청한 시점으로 돌아감
		}	
			
		if(!$("#customerPW").val()){//비밀번호를 입력하지 않으면 수행
			alert("비밀번호를 입력하세요");
			$("#customerPW").focus();
			status = false;
			return false; //사용자가 서비스를 요청한 시점으로 돌아감
		}
		
		if(!$("#customerName").val()){//이름을 입력하지 않으면 수행
			alert("이름을 입력하세요");
			$("#customerName").focus();
			status = false;
			return false; //사용자가 서비스를 요청한 시점으로 돌아감
		}
		
		if(!$("#customerBirth").val()){//생년월일을 입력하지 않으면 수행
			alert("태어난 해를 입력하세요");
			$("#customerBirth").focus();
			status = false;
			return false; //사용자가 서비스를 요청한 시점으로 돌아감
		}
		
		if(!$("#customerCellPhone").val()){//휴대폰번호를 입력하지 않으면 수행
			alert("휴대폰 번호를 입력하세요");
			$("#customerCellPhone").focus();
			status = false;
			return false; //사용자가 서비스를 요청한 시점으로 돌아감
		}
		
		if(!$("#customerEMail").val()){//이메일을 입력하지 않으면 수행
			alert("이메일주소를 입력하세요");
			$("#customerEMail").focus();
			status = false;
			return false; //사용자가 서비스를 요청한 시점으로 돌아감
		}
		
		}
		
		function passChk(){//비밀번호 수정
			var customerPW = document.form.customerPW.value;
			var customerPW2 = document.form.customerPW2.value;
			if(customerPW.length == 0 || customerPW2.length == null){
				document.form.chk.value = "비밀번호를 입력하세요";
			}else if (customerPW != customerPW2) {
				document.form.chk.value = "비밀번호가 다릅니다.";
			}else{
				document.form.chk.value = "비밀번호가 동일합니다.";
			}
			return;
			}
			
	});
</script>
</head>
<body>
	<form id="registerForm">
		<input type="hidden" id="customerIDCheck" value="N">
		<!-- ID체크 했는지 안했는지 여부 값 넘기는거 -->
		<h2 align="center">회원가입</h2>
		<p align="center">회원가입은 만14세 이상만 가능합니다.</p>

		<table style="height: 300px;" width="800px">
			<tbody>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;" colspan="2">
						<fieldset>
							<legend>약관 동의</legend>
							<label for="customerAccept"><input type="checkbox"
								id="customerAccept" name="customerAccept" value="Y"
								required="required">모든약관동의<br></label> <br> <label>·
								개인정보 이용약관 동의<br> <textarea rows="5" cols="60"
									readonly="readonly"></textarea>
							</label><br> <label>· 서비스 이용 약관<br> <textarea rows="5"
									cols="60" readonly="readonly"></textarea></label><br> 
									<label>·쇼핑정보 e-mail 수신 동의<br>
							</label><br> <label>· 쇼핑정보 SMS 수신 동의</label>
						</fieldset>
					</td>
				</tr>

				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;"><label
						for="customerID">아이디</label></td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerID" name="customerID" required="required"
						placeholder="아이디를 입력하세요" size="19" maxlength="12">&nbsp;<input
						type="button" id="customerIDCheck" value="중복확인"
						onclick="javascript:chkID"><small style="color: red;">
							12자이내 영문소문자와 숫자</small>
					</td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;"><label
						for="customerPW">비밀번호</label></td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="password" id="customerPW" name="customerPW"
						required="required" placeholder="8~12자 영문 소문자와 숫자만 가능" size="30"
						min="8" maxlength="12"></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;"><label>비밀번호확인</label></td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="password" id="customerPW2" name="customerPW2"
						required="required" placeholder="비밀번호와 똑같이 입력" size="30" min="8"
						maxlength="12" onblur="passChk()"></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">이름</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerName" name="customerName"
						required="required" placeholder="5자 이내 한글만 가능" size="30"></td>
				</tr>

				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">휴대폰번호</td>
					<td style="width: 300px; height: 30px;">&nbsp;<select
						name="customerCellPhone">	
							<option value="010">010</option>
							<option value="010">011</option>
					</select> 
					- <input type="text" id="customerCellPhone1"
						name="customerCellPhone1" size="5" maxlength="4"> - <input
						type="text" id="customerCellPhone2" name="customerCellPhone2"
						size="5" maxlength="4"></td>
				</tr>
`
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">성별</td>
					<td style="width: 300px; height: 30px;"><label><input
							type="radio" id="man" name="customerGender" value="남자">남자</label>
						<label><input type="radio" id="woman" name="customerGender"
							value="여자" >여자</label></td>
				</tr>
				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">생년월일</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="text" id="customerBirth" name="customerBirth"
						required="required" size="5" maxlength="4" placeholder="1900">년
						<select name="customerBirth1">
							<option value="Month" selected="selected">선택</option>
							<option value="01">1</option>
							<option value="02">2</option>
							<option value="03">3</option>
							<option value="04">4</option>
							<option value="05">5</option>
							<option value="06">6</option>
							<option value="07">7</option>
							<option value="08">8</option>
							<option value="09">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
					</select>월 <select name="customerBirth2">
							<option value="Date" selected="selected">선택</option>
							<option value="01">1</option>
							<option value="02">2</option>
							<option value="03">3</option>
							<option value="04">4</option>
							<option value="05">5</option>
							<option value="06">6</option>
							<option value="07">7</option>
							<option value="08">8</option>
							<option value="09">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
							<option value="25">25</option>
							<option value="26">26</option>
							<option value="27">27</option>
							<option value="28">28</option>
							<option value="29">29</option>
							<option value="30">30</option>
							<option value="31">31</option>
					</select>일
					</td>
				</tr>

				<tr style="height: 30px;">
					<td style="width: 200px; height: 30px;">이메일</td>
					<td style="width: 300px; height: 30px;">&nbsp;<input
						type="email" id="customerEMail" name="customerEMail"
						required="required" placeholder="abc1234@naver.com" size="16">
						<input type="button" id="customerEMail" value="이메일인증"></td>
				</tr>
			</tbody>
		</table>
	</form>
	<button type="submit" id="customerInsert">가입</button>
	<button type="reset" id="customerCancel">취소</button>
</body>
</html>