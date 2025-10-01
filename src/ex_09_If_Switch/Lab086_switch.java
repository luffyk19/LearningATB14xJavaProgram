package ex_09_If_Switch;

import java.util.Scanner;

public class Lab086_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number from 1 to 10");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            System.out.println("mon");
            break;

            case 2:
                System.out.println("tue");
        }
    }

}
