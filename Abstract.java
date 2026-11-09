class Car1{
    public void drive(){
        System.out.println("Car is driving");
    }
    public void playMusic(){
        System.out.println("Car is playing music");
    }
}

class Car2 extends Car1{
    @Override
    public void drive(){
        System.out.println("Car is driving fast");
    }
    @Override
    public void playMusic(){
        System.out.println("Car is playing music loudly");
    }
}
    public class Abstract{
        public static void main(String[] args) {
            Car1 car1 = new Car1();
            car1.drive();
            car1.playMusic();

            Car2 car2 = new Car2();
            car2.drive();
            car2.playMusic();
        }   
    } 