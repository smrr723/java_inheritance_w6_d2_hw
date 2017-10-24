package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int id;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    public Employee(int id, String name, String socialSecurityNumber, double salary) {
        this.id = id;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public int getId() {

        return id;
    }

//    public void setId(int id) {
//
//        this.id = id;
//    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
    if (name != null) {
        this.name = name;
    }
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String getSocialSecurityNumber() {

        return socialSecurityNumber;
    }

//    public void setSocialSecurityNumber(String socialSecurityNumber) {
//        this.socialSecurityNumber = socialSecurityNumber;
//    }
    public void raiseSalary(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }
}
