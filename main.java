class main
{
    int x;
    int y;

    int add(int x, int y)
    {
        return x + y;
    }

    public static void main(String args[])
    {
        main obj = new main();
        obj.x = 10;
        obj.y = 20;
        System.out.println(obj.add(obj.x, obj.y));
    }
    
}