package Lesson2;

public class Manager extends EmployeeClass {

    private double bonus;

    public Manager(String name, Double salary, Double bonus){
        super(name, salary);
        this.bonus = bonus;

    }
    public void setBonus(double bonus){
        this.bonus = bonus;

    }
    public double getBonus(double bonus){
        return bonus;

    }
    public double getSalary(double salary){
        return salary + bonus;

    }

}
