package sk.itsovy.kincel.test;

public class testmain {
    public static void main(String[] args) {
        ActionInterface plus=(a,b)->a+b;
        System.out.println(plus.operation(14,19));
    }
}