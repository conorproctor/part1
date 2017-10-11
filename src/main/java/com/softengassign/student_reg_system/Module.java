/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softengassign.student_reg_system;
import java.util.ArrayList;

/*
 *
 * @author cproc
 */

public class Module {
	
	private String name;
	private String id;
	private ArrayList<Student> studentList;
	
	public Module( String name, String id, ArrayList<Student> studentList ){
		this.name = name;
		this.id = id;
		this.studentList = studentList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}