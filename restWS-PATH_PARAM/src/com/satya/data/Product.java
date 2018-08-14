package com.satya.data;

public class Product {

	private String productId;
	private String productName;
	private String productDesc;
	
	public Product(String productId, String productName, String productDesc) {
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
	/*@Override
	public String toString() {
		 return new StringBuffer(" Product Id : ").append(this.productId)
		                .append(" Product Name : ").append(this.productName)
		                .append(" Product Desc : ").append(this.productDesc).toString();
	}*/
	
}
