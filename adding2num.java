import java.util.Scanner;
public class adding2num
{
    int area, length, breath,height,perimeter, volume;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breath = sc.nextInt(); 
        System.out.print("Enter height: "); 
        height = sc.nextInt();

    }
    void getarea()
    {
        area = length * breath;
        System.out.println("Area of rectangle: "+ area);

    }
    void getperimeter()
    {
        perimeter = 2*(length+breath);
        System.out.println("Perimeter of rectangle: "+ perimeter);  

    }
    void getvolume()
    {
        
        volume = length * breath * height;
        System.out.println("Volume of rectangle: "+ volume);  
    }
    public static void main(String args[])
    {
       adding2num obj = new adding2num();
        obj.getdata();
        obj.getarea();
        obj.getperimeter();
        obj.getvolume();
    }   
    
}