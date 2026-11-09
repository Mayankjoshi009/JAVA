import java.util.Scanner;
class area 
{
    int area ,lenght,breath;
    void getdata(int l, int b)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        l = sc.nextInt();
        b = sc.nextInt();   

        lenght = l;
        breath = b;
    }
    void getarea()
    {
        area = lenght * breath;
        System.out.println("Area of rectangle: "+ area);  
    }
    public static void main(String args[])              
    {
        
        area rs = new area();
        rs.getdata(0, 0);   
        rs.getarea();
    }
}
