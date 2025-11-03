package ex_20_OOPs_Polymorphism.Methodoverriding;

public class Lab189_Methodoverriding {
    public static void main(String[] args) {
        Kiran p1 = new Kiran();
        p1.home();
    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}


class Kiran extends Father{
    void home(){
        System.out.println("3BHK");
    }
}