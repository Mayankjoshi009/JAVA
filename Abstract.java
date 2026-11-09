abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Car is playing music");
    }
    public abstract void flying();
}

class wagonr extends Car{
    public void drive(){
        System.out.println("Wagonr is driving");
    }
    @Override   
    public void playMusic(){
        System.out.println("Wagonr is playing music");
    }
    public void flying(){
     System.out.println("Wagonr is flying");
    }
        
}

public class Abstract
{
    public static void main(String[] args) 
    {
        wagonr car = new wagonr();
        car.drive();
        car.playMusic();
        car.flying();
    }   
} 