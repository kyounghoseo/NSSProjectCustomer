package com.nss.customer.menrunningvo;

public class MenRunningVO {
	//상품필드
	private int productNo; // 상품번호
	private String productName; // 상품이름
	private String productCategory; // 상품분류
	private String productCode; // 상품코드
	private String productPrice;// 상품가겨
	private String productColor;// 상품색상
	private String productInfo;// 상품정보

	// 정렬필드
	private String all;
	private String priceSort;
	private String heighPrice;
	private String rowPrice;

	
	
	public String getPriceSort() {
		return priceSort;
	}

	public void setPriceSort(String priceSort) {
		this.priceSort = priceSort;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}

	public String getAll() {
		return all;
	}

	public void setAll(String all) {
		this.all = all;
	}

	public String getHeighPrice() {
		return heighPrice;
	}

	public void setHeighPrice(String heighPrice) {
		this.heighPrice = heighPrice;
	}

	public String getRowPrice() {
		return rowPrice;
	}

	public void setRowPrice(String rowPrice) {
		this.rowPrice = rowPrice;
	}

}
