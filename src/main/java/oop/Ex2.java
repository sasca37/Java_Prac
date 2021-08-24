package oop;

public class Ex2 {

    public void method(){
        System.out.println("a");
    }
}

class Sub extends Ex2 {

    @Override
    public void method() {
        System.out.println("b");
    }
}

class Ss {
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.method();
    }
}