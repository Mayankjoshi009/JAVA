class dog{
    void move(){
        System.out.println("This animal is running");
    }
}

class cat extends dog{

}

class bird extends dog{
    void move(){
        System.out.println("This animal is flying");
    }
}

class fish extends dog{
    void move(){
        System.out.println("This animal is swimming");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        dog d = new dog();
        d.move();

        cat c = new cat();
        c.move();

        bird b = new bird();
        b.move();

        fish f = new fish();
        f.move();
    }
}   