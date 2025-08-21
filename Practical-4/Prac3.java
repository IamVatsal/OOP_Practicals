public class Prac3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Vatsal", "E001", 500000.0);
        emp1.displayDetails();
        double bonus = emp1.calculateBonus();
        System.out.println("Bonus: " + bonus);
    }
}

class Employee {
    String empname;
    String empid;
    double salary;

    public Employee(String empname, String empid, double salary) {
        this.empname = empname;
        this.empid = empid;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + empname);
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: " + salary);
    }

    public double calculateBonus() {
        return salary * 0.1; // 10% bonus
    }
}