package ex_10_For_Loop;

public class Lab112_For_loop_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i==3){
                continue;
            }
            /**if (i==2){
                continue;
            }**/
            System.out.println(i);


        }
    }
}
