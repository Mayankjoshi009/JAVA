class Student
{
    int rollno, semester;
    String name , course;
    Student(int rollno, String name, String course, int semester)
    {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.semester = semester;
    }

}
class Academic extends Student
{
    int m1,m2,m3,m4,m5;
    Academic(int rollno, String name, String course, int semester, int m1, int m2, int m3, int m4, int m5)
    {
        super(rollno, name, course, semester);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

}
class Result extends Academic
{
    int total;
    double percentage;
    String grade;

    Result(int rollno, String name, String course, int semester, int m1, int m2, int m3, int m4, int m5)
    {
        super(rollno, name, course, semester, m1, m2, m3, m4, m5);
        total = m1 + m2 + m3 + m4 + m5;
        percentage = total / 5.0;

        if (percentage >= 90)
        {
            grade = "A+";
        }
        else if (percentage >= 80)
        {
            grade = "A";
        }
        else if (percentage >= 70)
        {
            grade = "B";
        }
        else if (percentage >= 60)
        {
            grade = "C";
        }
        else
        {
            grade = "D";
        }
    }

    void display()
    {
        System.out.println("___Student Result___");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3 + ", " + m4 + ", " + m5);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
class StudentResult
{
    public static void main(String args[])
    {
        Result r = new Result(101, "Mayank Joshi", "BTech CSE", 98, 85, 90, 78, 92, 88);
        r.display();
    }
}