package Lesson2;

public class EmployeeClass {

    protected String Name;
    protected double Salary;
    public EmployeeClass(String Name,double Salary) {
        this.Name = Name;
        this.Salary = Salary;
    }

    public double getSalary(double Salary) {
        return Salary;
    }

    public void setSalary(double Salary) {
        Salary = Salary;
    }
}
