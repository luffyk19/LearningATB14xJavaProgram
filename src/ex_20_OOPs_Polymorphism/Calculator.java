package ex_20_OOPs_Polymorphism;

public class Calculator {

    public static void main(String[] args) {
        Calc c1 = new Calc();
        System.out.println(c1.add(3, 4));
    }
}

class Calc {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}


