package Entity;

import Abstract.Entity;

public class Player implements Entity{
	
	private int id;
	private String tcNo;
	private String name;
	private String surName;
	private int dateOfBirth;
	
	public Player() {
		
	}
	
	public Player(int id, String tcNo, String name, String surName, int dateOfBirth) {

		this.id = id;
		this.tcNo = tcNo;
		this.name = name;
		this.surName = surName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
