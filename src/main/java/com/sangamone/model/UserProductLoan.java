package com.sangamone.model;
import java.util.Date;
public class UserProductLoan {
	private int product_id;
	private int center_id;
	private int loan_id;
	private int loanuser_id;
	public Date date;
	private int from_user_id;
	private int to_user_id;
	private int commission;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	
	public int getLoanuser_id() {
		return loanuser_id;
	}
	public void setLoanuser_id(int loanuser_id) {
		this.loanuser_id = loanuser_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getFrom_user_id() {
		return from_user_id;
	}
	public void setFrom_user_id(int from_user_id) {
		this.from_user_id = from_user_id;
	}
	public int getTo_user_id() {
		return to_user_id;
	}
	public void setTo_user_id(int to_user_id) {
		this.to_user_id = to_user_id;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	

}
