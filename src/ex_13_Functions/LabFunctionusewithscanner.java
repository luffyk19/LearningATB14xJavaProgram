package ex_13_Functions;

import java.util.Scanner;

public class LabFunctionusewithscanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enetr the value for A");
        int a = scanner.nextInt();

        System.out.println("Enter the value for B");
        int b = scanner.nextInt();

        int Sum = sum_of_two_num(a,b);
       // int Sum1 = sum_of_two_num(10,10);
        System.out.println(Sum);
       // System.out.println(Sum1);

    }

    static int sum_of_two_num(int a,int b){
        return a+b;
    }

}
