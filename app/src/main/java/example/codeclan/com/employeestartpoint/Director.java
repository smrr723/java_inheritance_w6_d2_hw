package example.codeclan.com.employeestartpoint;

/**
 * Created by scott on 24/10/2017.
 */

public class Director extends Manager{
    private double budget;

    public Director(double budget, String deptName, int id, String name, String socialSecurityNumber, double salary){
        super(deptName, id, name, socialSecurityNumber, salary);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
