import java.util.Scanner;
public class isstuddentdata

{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of students: ");
        String name = scanner.nextLine();
        System.out.print("Enter the GPA number of students: ");
        double gpa = scanner.nextDouble();
        System.out.print("Is the student enrolled? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        if (isStudent) {
            System.out.println(name + " is enrolled in the school.");
        } else {
            System.out.println(name + " is not enrolled in the school.");
        }
        System.out.println("Student Name: " + name);
        System.out.println("Student GPA: " + gpa);
        scanner.close();
    }    
}
