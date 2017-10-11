/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
/**
 *
 * @author cproc
 */
import com.softengassign.student_reg_system.Student;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
	
	@Test
	public void getUname(){
		Student student = new Student( "Conor", 22, "07/3/1995", 1);
		assertEquals( student.getUname(), student.getName() + student.getAge() );
	}

}