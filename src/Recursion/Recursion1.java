package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        message();
    }

    // Concept of Recursion.
    static void message(){
        System.out.println("Hello World");
        message1(); // Function calling another function.
    }
    static void message1(){
        System.out.println("Hello World");
        message2(); // Function calling another function.
    }
    static void message2(){
        System.out.println("Hello World");
        message3(); // Function calling another function.
    }
    static void message3(){
        System.out.println("Hello World");
        message4(); // Function calling another function.
    }
    static void message4(){
        System.out.println("Hello World");
    }
}
