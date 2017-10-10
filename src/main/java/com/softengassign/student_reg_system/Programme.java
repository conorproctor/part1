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


public class Programme {

	private String course;
	private Module[] modules;
	private DateTime startDate;
	private DateTime endDate;
	
	public Programme(String name, Module[] mods, DateTime start, DateTime end) {
		course = name;
		modules = mods;
		startDate = start;
		endDate = end;
		
	}
	
	public String getCourse() {
		return(course);
	}
	public Module[] getModules() {
		return(modules);
	}
	public DateTime getStartDate() {
		return(startDate);
	}
	public DateTime getEndDate() {
		return(endDate);
	}
}