public class Employee {
    private String name;
    private String lastName;
    private double monthlySalary;

    public Employee(String n, String l, double salary) {
        name = n;
        lastName = l;
        if (salary > 0) monthlySalary = salary;
        else monthlySalary = 0.0;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0) monthlySalary = salary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getFullName() {
        return name + " " + lastName;
    }
}
 
