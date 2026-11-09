class multiply
{
    int result, a, b;
    void getdata(int x, int y)
   {
    result = x * y;
   }
   void getresult()
   {
    getdata(5, 10);
    
    multiply multi = new multiply();
                    
    multi.getdata(5, 10);
    System.out.println("Multiplication of two numbers: "+ result);  
   }    
}   
