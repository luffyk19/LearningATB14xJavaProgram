package ex_08_If_condition;

import java.util.Scanner;

public class Lab082_if_Else_scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();
        if (age>18) {
            System.out.println("you can go");
        }else {
            System.out.println("you can not go");
        }
    }
}
