package Task;

import java.util.Scanner;

public class Challenge7_Largest_of_3number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = scanner.nextInt();
        System.out.println("enter 2nd number");
        int n2 = scanner.nextInt();
        System.out.println("enter 3rd number");
        int n3 = scanner.nextInt();

        if(n1 > n2){
            System.out.println(n2);

        } else if (n2 > n1) {
            System.out.println(n1);


        }else
            System.out.println(n3);

    }


}
