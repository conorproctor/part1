/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softengassign.student_reg_system;

import org.joda.time.LocalDate;
/**
 *
 * @author cproc
 */

public class Student {

	private String name;
	private int age;
	private String dob;
	private int ID;
	private String username;
	
	public Student(String nm, int years, String birth, int id){
		name = nm;
		age = years;
		dob = birth;
		ID = id;
		
	}
	
	public String getUsername(){
		username = name + (Integer.toString(age));
		return(username);
		
	}
	public String getName() {
		return(name);
	}
	public int getAge() {
		return(age);
	}
	public String getDOB() {
		return(dob);
	}
	public int getID() {
		return(ID);
	}
}