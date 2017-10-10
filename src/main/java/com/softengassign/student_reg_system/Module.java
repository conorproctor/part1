/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softengassign.student_reg_system;


import com.softengassign.student_reg_system.Student;
/**
 *
 * @author cproc
 */

public class Module {
	
	private String moduleName;
	private String ID;
	private Student[] students;

	public Module(String name, String id, Student[] enrolements) {
		moduleName = name;
		ID = id;
		students = enrolements;
	}
	
	public String getModuleName() {
		return(moduleName);
	}
	public String getID() {
		return(ID);
	}
	public Student[] getStudents() {
		return(students);
	}
}
