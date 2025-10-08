package ex_13_Functions;

public class Lab131_User_Defined {
    public static void main(String[] args) {
        int Sum = sum_of_two_num( 3,4);
        int Sum1 = sum_of_two_num(10,10);
        System.out.println(Sum);
        System.out.println(Sum1);

    }

    static int sum_of_two_num(int a,int b){
        return a+b;
    }

}

