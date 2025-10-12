package Task;

import java.util.Scanner;

public class Challenge6_Positive_Negative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scanner.nextInt();
        if(num > 0){
            System.out.println("positive");
            
        } else if (num < 0) {
            System.out.println("Negative");
            
        }else {
            System.out.println("number is zero");
        }
    }
}
