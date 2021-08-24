package test;

import java.util.Scanner;

public class Section1_7 {

    public String solution(String str) {
        str = str.toUpperCase();
        char[] x = str.toCharArray();
        int lt = 0;
        int rt = x.length-1;

        while (lt < rt) {
            char tmp = x[lt];
            x[lt] = x[rt];
            x[rt] = tmp;
            lt++;
            rt--;
        }
        String answer = String.valueOf(x);
        if (answer.equals(str)){
            return "YES";
        }
        else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Section1_7 main = new Section1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
