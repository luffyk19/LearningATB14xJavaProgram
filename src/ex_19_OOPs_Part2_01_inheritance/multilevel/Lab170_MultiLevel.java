package ex_19_OOPs_Part2_01_inheritance.multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
        Son Kiran = new Son();
        Kiran.home();
        Kiran.bhk3();
        Kiran.extra();
        Kiran.gf();

        Father f = new Father();
        f.gf();
        f.home();
        f.extra();

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();


    }
}
