package com.code;

import java.math.BigInteger;

public class AccountDetails {
	String payeeName;
	String nickName;
	BigInteger creditAccNum;
	String remarks;
	BigInteger debitAccNum;
	String date;
	String amount;
	String paymentType;
	String payVia;


	public String getPayeeName(AccountDetails obj) {
		return obj.payeeName;
	}

	public void setPayeeName(String name) {
		payeeName = name;
	}

	public String getNickName(AccountDetails obj) {
		return obj.nickName;
	}

	public void setNickName(String name) {
		nickName = name;
	}

	public BigInteger getCreditAccNum(AccountDetails obj) {
		return obj.creditAccNum;
	}

	public void setCreditAccNum(BigInteger num) {
		creditAccNum = num;
	}

	public String getRemarks(AccountDetails obj) {
		return obj.remarks;
	}

	public void setRemarks(String r) {
		remarks = r;
	}

	public BigInteger getDebitAccNum(AccountDetails obj) {
		return obj.debitAccNum;
	}

	public void setDebitAccNum(BigInteger num) {
		debitAccNum = num;
	}

	public String getDate(AccountDetails obj) {
		return obj.date;
	}

	public void setDate(String dt) {
		date = dt;
	}

	public String getAmount(AccountDetails obj) {
		return obj.amount;
	}

	public void setAmount(String num) {
		amount = num;
	}

	public String getPaymentType(AccountDetails obj) {
		return obj.paymentType;
	}

	public void setPaymentType(String ptype) {
		paymentType = ptype;
	}

	public String getPayVia(AccountDetails obj) {
		return obj.payVia;
	}

	public void setPayVia(String pV) {
		payVia = pV;
	}



	public String toString() {
		return " "+ payeeName +" "+ nickName +" "+ creditAccNum +" "+ remarks +" "+ debitAccNum +" "+ date +" "+ amount +" "+ paymentType +" "+ payVia +" ";
	}
}
