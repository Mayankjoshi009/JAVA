class parents{
    void show(){
        System.out.println("This is parents class");
    }

}
class child extends parents{
    void show(){
        System.out.println("This is child class");
    }
    void display(){
        show();
        super.show();
    }
}
class override{
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}