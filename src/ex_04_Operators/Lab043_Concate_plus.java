package ex_04_Operators;

public class Lab043_Concate_plus {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        String first_name = "kiran";
        String last_name = "koujalgi";
        System.out.println(a + b + first_name + last_name);
        System.out.println(first_name + last_name + a + b);
        System.out.println(first_name + last_name + (a + b));
    }
}