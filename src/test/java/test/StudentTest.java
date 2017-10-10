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
    public void getUsername() throws Exception {
        Student stud = new Student("Conor Proctor", 22, "07-03-1995", 1);
        String actualUsername = stud.getUsername();
        String expectedUsername = "ConorProctor22";
        assertEquals(actualUsername,expectedUsername);
    }

}

