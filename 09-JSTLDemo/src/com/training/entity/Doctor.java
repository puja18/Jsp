package com.training.entity;

public class Doctor {
	int experience;
	String name;
	int id;
	String qualification;
	double fees;
	String gender;
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Doctor [experience=" + experience + ", name=" + name + ", id="
				+ id + ", qualification=" + qualification + ", fees=" + fees
				+ ", gender=" + gender + "]";
	}
	

}
