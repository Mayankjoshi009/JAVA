class subject
{
    int maths, physics, chemistry, biology, english,total;
    float percentage;
    public subject()
    {
        maths = 10;
        physics = 20;
        chemistry = 30;
        biology = 40;
        english = 50;
    }
    void total()
    {
        total = maths + physics + chemistry + biology + english;
    }
    void percentage()
    {
        total = maths + physics + chemistry + biology + english;
        percentage = (total / 500.0f) * 100;
    }
    void devision()
    {
        if(percentage >= 60)
        {
            System.out.println("First Division");
        }
        else if(percentage >= 50)
        {
            System.out.println("Second Division");
        }
        else if(percentage >= 40)
        {
            System.out.println("Third Division");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    void display()
    {
        System.out.println("Maths: " + maths);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Biology: " + biology);
        System.out.println("English: " + english);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }
}
class mark
{
    public static void main(String args[])
    {
        subject s = new subject();
        s.total();
        s.percentage();
        s.devision();
        s.display();
    }
}   
