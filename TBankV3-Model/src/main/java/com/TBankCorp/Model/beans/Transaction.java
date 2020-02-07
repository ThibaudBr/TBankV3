package com.TBankCorp.Model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionBean {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTransaction;
	private int idUtil;
	private int idAccountInit;
	private int amountFinalAccountInit;
	private int idAccountEnd;
	private int amountAccountEnd;
	private String date;
	private int amount;

	public TransactionBean(int idTransaction, int idUtil, int idAccountInit, int amountFinalAccountInit, int idAccountEnd, int amountAccountEnd, String date, int amount) {
		this.idTransaction = idTransaction;
		this.idUtil = idUtil;
		this.idAccountInit = idAccountInit;
		this.amountFinalAccountInit = amountFinalAccountInit;
		this.idAccountEnd = idAccountEnd;
		this.amountAccountEnd = amountAccountEnd;
		this.date = date;
		this.amount = amount;
	}

	public TransactionBean(){}

	public int getIdTransaction() {
		return idTransaction;
	}
	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}
	public int getIdUtil() {
		return idUtil;
	}
	public void setIdUtil(int idUtil) {
		this.idUtil = idUtil;
	}
	public int getIdAccountInit() {
		return idAccountInit;
	}
	public void setIdAccountInit(int idAccountInit) {
		this.idAccountInit = idAccountInit;
	}
	public int getIdAccountEnd() {
		return idAccountEnd;
	}
	public void setIdAccountEnd(int idAccountEnd) {
		this.idAccountEnd = idAccountEnd;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getAmountFinalAccountInit() {
		return amountFinalAccountInit;
	}
	public void setAmountFinalAccountInit(int amountFinalAccountInit) {
		this.amountFinalAccountInit = amountFinalAccountInit;
	}
	public int getAmountAccountEnd() {
		return amountAccountEnd;
	}
	public void setAmountAccountEnd(int amountAccountEnd) {
		this.amountAccountEnd = amountAccountEnd;
	}

 
}
