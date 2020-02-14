package com.TBankCorp.Model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idTransaction;
	private int idUtilInit;
	private int idAccountInit;
	private int idUtilEnd;
	private int idAccountEnd;
	private String date;
	private int amount;

	public Transaction(){
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"idTransaction=" + idTransaction +
				", idUtilInit=" + idUtilInit +
				", idAccountInit=" + idAccountInit +
				", idUtilEnd=" + idUtilEnd +
				", idAccountEnd=" + idAccountEnd +
				", date='" + date + '\'' +
				", amount=" + amount +
				'}';
	}



	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public int getIdUtilInit() {
		return idUtilInit;
	}

	public void setIdUtilInit(int idUtilInit) {
		this.idUtilInit = idUtilInit;
	}

	public int getIdAccountInit() {
		return idAccountInit;
	}

	public void setIdAccountInit(int idAccountInit) {
		this.idAccountInit = idAccountInit;
	}

	public int getIdUtilEnd() {
		return idUtilEnd;
	}

	public void setIdUtilEnd(int idUtilEnd) {
		this.idUtilEnd = idUtilEnd;
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

	public Transaction(int idTransaction, int idUtilInit, int idAccountInit, int idUtilEnd, int idAccountEnd, String date, int amount) {
		this.idTransaction = idTransaction;
		this.idUtilInit = idUtilInit;
		this.idAccountInit = idAccountInit;
		this.idUtilEnd = idUtilEnd;
		this.idAccountEnd = idAccountEnd;
		this.date = date;
		this.amount = amount;
	}
}
