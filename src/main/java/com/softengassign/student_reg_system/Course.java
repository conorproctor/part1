/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softengassign.student_reg_system;

/**
 *
 * @author cproc
 */

import org.joda.time.*;
import java.util.ArrayList;

public class Course {

	private String name;
	private ArrayList<Module> moduleList;
	private DateTime startDate;
	private DateTime endDate;

	public Course(String n, ArrayList<Module> modList, DateTime startDate, DateTime endDate) {
		this.name = n;
		this.moduleList = modList;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public ArrayList<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(ArrayList<Module> modList) {
		this.moduleList = modList;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

}