package com.arbs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction_master")
public class Transaction {
	@Id
	@Column(name="transaction_id")
	private String transaction_id;
	@Column(name="transaction_type")
	private String transaction_type;
	@Column(name="transaction_date")
	private Date transaction_date;
	@Column(name="transaction_amount")
	private Double transaction_amount;
	@Column(name="transtatus")
	private String transtatus;
	@Column(name="fromDate")
	private Date fromDate;
	@Column(name="toDate")
	private Date toDate;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	public String getTranstatus() {
		return transtatus;
	}
	public void setTranstatus(String transtatus) {
		this.transtatus = transtatus;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public Double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(Double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	
	
	

}
