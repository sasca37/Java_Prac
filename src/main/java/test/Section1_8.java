package test;

import java.util.Scanner;

public class Section1_8 {

    public String solution(String str) {
        String answer ="";
        str = str.trim();
        char[] x = str.toCharArray();
        String[] s = str.split(" ");
        return s.toString();
    }

    public static void main(String[] args) {
        Section1_8 main = new Section1_8();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
