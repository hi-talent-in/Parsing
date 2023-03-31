package com.spring.search.file;

public class variables {
	private String accountHolderName;
	private String nickName;
	private String creditAccountNo;
	private String remarks;
	private String debitAccountNo;
	private String date;
	private String amount;
	private String paymentType;
	private String payVia;
	@Override
	public String toString() {
		return "[ " + accountHolderName + ", " + nickName + ", "
				+ creditAccountNo + ", " + remarks + ", " + debitAccountNo + ", " + date
				+ ", " + amount + ", " + paymentType + ", " + payVia + "]";
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getCreditAccountNo() {
		return creditAccountNo;
	}
	public void setCreditAccountNo(String creditAccountNo) {
		this.creditAccountNo = creditAccountNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDebitAccountNo() {
		return debitAccountNo;
	}
	public void setDebitAccountNo(String debitAccountNo) {
		this.debitAccountNo = debitAccountNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPayVia() {
		return payVia;
	}
	public void setPayVia(String payVia) {
		this.payVia = payVia;
	}
	public variables() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
