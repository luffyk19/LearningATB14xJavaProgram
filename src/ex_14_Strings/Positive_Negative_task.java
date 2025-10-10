package ex_14_Strings;

import java.util.Scanner;

public class Positive_Negative_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("Positive");
        }else if (num < 0){
            System.out.println("neative");
        }
        else {


            System.out.println("number is Zero");
        }
    }


}
