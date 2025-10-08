package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        non_return_type_function();
        String name = return_string_type_function();
        System.out.println(name);
    }
    static void non_return_type_function(){
        System.out.println("hi there no return function");
    }
    static String return_string_type_function(){
        System.out.println("hi there i will return something");
        return "kiran";
    }

}
