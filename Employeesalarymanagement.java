import java.util.Scanner;
class Employee 
{
    int employeeid;
    String employeename;
    double employeesalary;

    Employee(int employeeid, String employeename, double employeesalary) 
    {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeesalary = employeesalary;
    }
}

class Manager extends Employee 
{
    double hra;
    double da;

    Manager(int employeeid, String employeename, double employeesalary) 
    {
        super(employeeid, employeename, employeesalary);

        hra = employeesalary * 0.20;
        da = employeesalary * 0.10;
    }
}

class Seniormanager extends Manager 
{
    double specialallowance;
    double bonus;
    double finalsalary;

    Seniormanager(int employeeid, String employeename, double employeesalary) 
    {
        super(employeeid, employeename, employeesalary);

        specialallowance = employeesalary * 0.15;
        bonus = employeesalary * 0.10;

        finalsalary = employeesalary + hra + da + specialallowance + bonus;
    }

    void display() 
    {
        System.out.println("----- Employee Salary Details -----");
        System.out.println("Employee ID: " + employeeid);
        System.out.println("Employee Name: " + employeename);
        System.out.println("Basic Salary: " + employeesalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Special Allowance: " + specialallowance);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final Salary: " + finalsalary);
    }
}

public class Employeesalarymanagement 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        Seniormanager sm = new Seniormanager(id, name, salary);

        sm.display();
    }
}