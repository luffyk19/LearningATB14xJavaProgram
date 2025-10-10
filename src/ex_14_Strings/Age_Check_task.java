package ex_14_Strings;

import java.util.Scanner;

public class Age_Check_task {
    public static void main(String[] args) {
        //int age = age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();

        if (age >= 18){
            System.out.println("elgible to vote");
        }else{
            System.out.println("you are a minor");
        }
    }



}
