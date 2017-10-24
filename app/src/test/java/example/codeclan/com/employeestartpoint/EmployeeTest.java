package example.codeclan.com.employeestartpoint;

import android.text.style.AbsoluteSizeSpan;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Engineer engineer;
    Admin admin;
    Director director;

    @Before
    public void before() {
        employee = new Employee(1, "Gerry", "ABC12345", 50000.0);
        engineer = new Engineer(1, "Scott", "ABC12345", 60000.0);
        admin = new Admin(1, "Wilma", "ABC12345", 40000.0);
        manager = new Manager("Engineering", 2, "Russell", "ABC12345", 80000.0);
        director = new Director(1000000.0, "Marketing", 2, "Russell", "ABC12345", 80000.0);

    }
//
//    @Test
//    public void newEmployeeIdIsZero() {
//        assertEquals(0, employee.getId());
//    }
//
//    @Test
//    public void newEmployeeNameIsNull() {
//        assertNull(employee.getName());
//    }
//
//    @Test
//    public void newEmployeeSSnIsNull() {
//        assertNull(employee.getSocialSecurityNumber());
//    }
//
//    @Test
//    public void newEmployeeSalaryIsNull() {
//        assertEquals(0, employee.getSalary(), 0.01);
//    }

//    @Test
//    public void canSetEmployeeId() {
//        employee.setId(1);
//        assertEquals(1, employee.getId());
//    }

    @Test
    public void canSetName() {
        employee.setName("Ted");
        engineer.setName("Bob");
        admin.setName("Bill");
        manager.setName("Toby");
        assertEquals("Ted", employee.getName());
        assertEquals("Bob", engineer.getName());
        assertEquals("Bill", admin.getName());
        assertEquals("Toby", manager.getName());
    }

    @Test
    public void canGetDept(){
        assertEquals("Engineering", manager.getDept());
        assertEquals("Marketing", director.getDept());
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.01);
    }

//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("AB123456C");
//        assertEquals("AB123456C", employee.getSocialSecurityNumber());
//    }

    @Test
    public void canSetSalary() {
        employee.setSalary(30000.00);
        director.setSalary(90000.00);
        assertEquals(30000.00, employee.getSalary(), 0.01);
        assertEquals(90000.00, director.getSalary(), 0.01);

    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(1000.00);
        director.raiseSalary(1000.00);
        manager.raiseSalary(-5000.00);
        assertEquals(51000.0, employee.getSalary(), 0.01);
        assertEquals(81000.0, director.getSalary(), 0.01);
        assertEquals(80000.00, manager.getSalary(), 0.01);
    }
}
