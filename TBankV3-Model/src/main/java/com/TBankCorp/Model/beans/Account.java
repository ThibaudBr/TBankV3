package com.TBankCorp.Model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idAccount;
	private int idUtil;
	private int money;
	private String name;

	@Override
	public String toString() {
		return "Account{" +
				"idAccount=" + idAccount +
				", idUtil=" + idUtil +
				", money=" + money +
				", name='" + name + '\'' +
				'}';
	}



	public Account(int idAccount, int idUtil, int money, String name) {
		this.idAccount = idAccount;
		this.idUtil = idUtil;
		this.money = money;
		this.name = name;
	}

	public Account(){}

	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public int getIdUtil() {
		return idUtil;
	}
	public void setIdUtil(int idUtil) {
		this.idUtil = idUtil;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
