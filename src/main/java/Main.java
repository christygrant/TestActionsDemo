package main.java;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main...");

        Adder adder = new Adder();
        int result = adder.add(5, 7);
        System.out.println("The sum is: " + result);
    }
}