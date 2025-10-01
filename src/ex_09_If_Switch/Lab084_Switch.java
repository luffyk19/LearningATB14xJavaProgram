package ex_09_If_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");

        if (scanner.hasNextInt()){
            int day = scanner.nextInt();
            switch (day){
                case 1:
                    System.out.println("mon");
                    break;
                case 2:
                    System.out.println("tue");
                    break;
                case 3:
                    System.out.println("wed");
                    break;
                case 4:
                    System.out.println("thur");
                    break;
                case 5:
                    System.out.println("fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("enter number from 1 to 7 only");
            }

        }else{
            System.out.println("enter int please");
        }

    }
}
