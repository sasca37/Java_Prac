package rambda;

import java.net.Inet4Address;
import java.util.function.Function;

public class Ex5 {
    public static void main(String[] args) {
        Function<String, Integer> work = s -> {
            System.out.println("문자열 숫자 변환");
            return Integer.parseInt(s);
        };
        Function<Integer, String> after = i -> {
            System.out.println("숫자 문자열 변환");
            return ""+i;
        };
        if(work.andThen(after).apply("123") instanceof String) {
            System.out.println("문자열 o");
        }
        else System.out.println("문자열 x");
    }
}
