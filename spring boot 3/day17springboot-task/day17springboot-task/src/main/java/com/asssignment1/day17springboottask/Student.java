package com.asssignment1.day17springboottask;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
@Entity
@Table(name="College_Student")

public class Student {
	@Id
	@Column(name="student_Id")
	int Id;
	@Column(name="Student_name")
	String name;
	@Column(name="Score_1")
	float score1;
	@Column(name="Score_2")
	float score2;
	@Column(name="Score_3")
	float score3;
	
	


public Student() {
	
}
public Student(int a,String b, float c,float d, float e) {
	
	Id=a;
	name=b;
	score1=c;
	score2=d;
	score3=e;
	
}
public int getId() {
	return Id;
}
public void setId(int id) {
	this.Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getScore1() {
	return score1;
}
public void setScore1(float score1) {
	this.score1 = score1;
}
public float getScore2() {
	return score2;
}
public void setScore2(float score2) {
	this.score2 = score2;
}
public float getScore3() {
	return score3;
}
public void setScore3(float score3) {
	this.score3 = score3;
}

}