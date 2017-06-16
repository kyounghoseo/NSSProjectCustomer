package com.nss.customer.customervo;

public class CustomerVO {

	// 필드선언
	private int customerNO; // 회원 번호
	private String customerID; // 회원 아이디
	private String customerPW; // 회원 비밀번호
	private String customerName; // 회원 이름
	private String customerCellPhone; // 회원 휴대폰번호
	private String customerCellPhone1; // 회원 휴대폰번호
	private String customerCellPhone2; // 회원 휴대폰번호
	private String customerEMail; // 회원 이메일
	private String customerBirth; // 회원 생년월일
	private String customerBirth1; // 회원 생년월일
	private String customerBirth2; // 회원 생년월일
	private String customerGender; // 회원 성별
	private String customerAccept; // 회원 동의
	private String customerDate; // 회원 가입날짜
	private String customerCheck; // 회원여부

	private String LoginCustomerID; // 로그인시 사용자가 적은 아이디
	private String LoginCustomerPW; // 로그인시 사용자가 적은 비밀번호
	private String IDCustomerName; // 아이디 찾기때 사용자가 적은 이름
	private String IDCustomerEMail; // 아이디 찾기때 사용자가 적은 이름
	
	// 접근자get, 설정자set
	public int getCustomerNO() {
		return customerNO;
	}
	public void setCustomerNO(int customerNO) {
		this.customerNO = customerNO;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerPW() {
		return customerPW;
	}
	public void setCustomerPW(String customerPW) {
		this.customerPW = customerPW;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCellPhone() {
		return customerCellPhone;
	}
	public void setCustomerCellPhone(String customerCellPhone) {
		this.customerCellPhone = customerCellPhone;
	}
	public String getCustomerCellPhone1() {
		return customerCellPhone1;
	}
	public void setCustomerCellPhone1(String customerCellPhone1) {
		this.customerCellPhone1 = customerCellPhone1;
	}
	public String getCustomerCellPhone2() {
		return customerCellPhone2;
	}
	public void setCustomerCellPhone2(String customerCellPhone2) {
		this.customerCellPhone2 = customerCellPhone2;
	}
	public String getCustomerEMail() {
		return customerEMail;
	}
	public void setCustomerEMail(String customerEMail) {
		this.customerEMail = customerEMail;
	}
	public String getCustomerBirth() {
		return customerBirth;
	}
	public void setCustomerBirth(String customerBirth) {
		this.customerBirth = customerBirth;
	}
	public String getCustomerBirth1() {
		return customerBirth1;
	}
	public void setCustomerBirth1(String customerBirth1) {
		this.customerBirth1 = customerBirth1;
	}
	public String getCustomerBirth2() {
		return customerBirth2;
	}
	public void setCustomerBirth2(String customerBirth2) {
		this.customerBirth2 = customerBirth2;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerAccept() {
		return customerAccept;
	}
	public void setCustomerAccept(String customerAccept) {
		this.customerAccept = customerAccept;
	}
	public String getCustomerDate() {
		return customerDate;
	}
	public void setCustomerDate(String customerDate) {
		this.customerDate = customerDate;
	}
	public String getCustomerCheck() {
		return customerCheck;
	}
	public void setCustomerCheck(String customerCheck) {
		this.customerCheck = customerCheck;
	}
	public String getLoginCustomerID() {
		return LoginCustomerID;
	}
	public void setLoginCustomerID(String loginCustomerID) {
		LoginCustomerID = loginCustomerID;
	}
	public String getLoginCustomerPW() {
		return LoginCustomerPW;
	}
	public void setLoginCustomerPW(String loginCustomerPW) {
		LoginCustomerPW = loginCustomerPW;
	}
	public String getIDCustomerName() {
		return IDCustomerName;
	}
	public void setIDCustomerName(String iDCustomerName) {
		IDCustomerName = iDCustomerName;
	}
	public String getIDCustomerEMail() {
		return IDCustomerEMail;
	}
	public void setIDCustomerEMail(String iDCustomerEMail) {
		IDCustomerEMail = iDCustomerEMail;
	}

}
