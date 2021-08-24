package rambda;

import java.util.function.Supplier;

public class ex2 {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("매개변수 x 반환 x");
        r.run();
        Supplier<String> s = () -> "매개변수 x, 반환o";
        System.out.println(s.get());
    }
}
