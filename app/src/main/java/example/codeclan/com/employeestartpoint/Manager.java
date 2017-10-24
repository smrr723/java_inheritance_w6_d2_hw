package example.codeclan.com.employeestartpoint;

/**
 * Created by scott on 24/10/2017.
 */

public class Manager extends Employee {
    private String deptName;

    public Manager(String deptName, int id, String name, String socialSecurityNumber, double salary){
        super(id, name, socialSecurityNumber, salary);
        this.deptName = deptName;
    }

    public String getDept(){
        return this.deptName;
    }
}
