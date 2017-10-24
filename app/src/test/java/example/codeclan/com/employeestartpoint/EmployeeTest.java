package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;

    @Before
    public void before() {
        employee = new Employee(1, "Wilma", "ABC12345", 50000.0);
        manager = new Manager("Engineering", 2, "Wilma", "ABC12345", 50000.0);
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
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
    }

//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("AB123456C");
//        assertEquals("AB123456C", employee.getSocialSecurityNumber());
//    }

    @Test
    public void canSetEmployeeSalary() {
        employee.setSalary(30000.00);
        assertEquals(30000.00, employee.getSalary(), 0.01);
    }
}
