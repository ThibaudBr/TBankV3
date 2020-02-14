package com.TBankCorp.Model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Util {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUtil;
	private String name;
	private int age;
	private String mail;
	private String idConnexion;
	private String password;
	private String statut;

	@Override
	public String toString() {
		return "Util{" +
				"idUtil=" + idUtil +
				", name='" + name + '\'' +
				", age=" + age +
				", mail='" + mail + '\'' +
				", idConnexion='" + idConnexion + '\'' +
				", password='" + password + '\'' +
				", statut='" + statut + '\'' +
				'}';
	}

	public Util(int idUtil, String name, int age, String mail, String idConnexion, String password, String statut) {
		this.idUtil = idUtil;
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.idConnexion = idConnexion;
		this.password = password;
		statut = statut;
	}

	public Util(){}

	public int getIdUtil() {
		return idUtil;
	}
	public void setIdUtil(int idUtil) {
		this.idUtil = idUtil;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getIdConnexion() {
		return idConnexion;
	}
	public void setIdConnexion(String idConnexion) {
		this.idConnexion = idConnexion;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
}
