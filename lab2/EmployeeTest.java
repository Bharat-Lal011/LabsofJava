public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", "Sharma", 20000);
        Employee e2 = new Employee("Anita", "Verma", 25000);

        System.out.println("Yearly Salary Before Hike:");
        System.out.println(e1.getFullName() + ": " + (e1.getMonthlySalary() * 12));
        System.out.println(e2.getFullName() + ": " + (e2.getMonthlySalary() * 12));

        // 10% hike
        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        System.out.println("\nYearly Salary After Hike:");
        System.out.println(e1.getFullName() + ": " + (e1.getMonthlySalary() * 12));
        System.out.println(e2.getFullName() + ": " + (e2.getMonthlySalary() * 12));
    }
}
 