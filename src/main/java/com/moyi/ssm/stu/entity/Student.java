package com.moyi.ssm.stu.entity;

public class Student {

	private String stuNo;
	
	private String stuName;
	
	private int gender;
	
	private int age;
	
	private int score;

	/**
	 * @return the stuNo
	 */
	public String getStuNo() {
		return stuNo;
	}

	/**
	 * @param stuNo the stuNo to set
	 */
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	/**
	 * @return the stuName
	 */
	public String getStuName() {
		return stuName;
	}

	/**
	 * @param stuName the stuName to set
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	/**
	 * @return the gender
	 */
	public int getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
}
