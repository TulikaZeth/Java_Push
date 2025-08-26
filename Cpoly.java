package Oops.Polymorphism;

public class Cpoly {
   

    public static void main(String[] args) {
       System.out.println("A");
       Cpoly cc = new Cpoly();
       cc.m1();
    }

    void m1(int a){
        System.out.println("B");
    }


    void m1(int a , String b){
        System.out.println("C");
    }

    void m1(String a, int b){
        System.out.println("D");
    
    }
}