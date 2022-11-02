package com.day16.demo16;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="college")
public class Account {
	@Id
	@Column(name="accountId")
	
	int Id;
	@Column(name="accountholdername")
	String name;
	@Column(name="balanceamount")
	float balance;

	public Account() {
	
	}
	
	public Account(int a,String b, float c) {
		Id=a;
		name=b;
		balance=c;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

}
