package ex_17_OOPs;

public class Lab160_Constructor {
 public static void main (String args[]){
     Student s1 = new Student();
     Student s2 = new Student("Kiran");
 }
}
class Student{
    String name;


    Student(){
        System.out.println("hi , i am called");
    }
    Student(String name){
        System.out.println("PC- HI," + name);
    }
    void sleep(){}


}