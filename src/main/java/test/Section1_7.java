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

    public String solution2(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return answer;
    }

    public String solution3(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
//        if (!tmp.equals(str))  answer = "NO";
        if (!str.equalsIgnoreCase(tmp)) answer="NO"; //equals() : 대소문자 구분, equalsIgnoreCase() : 대소문자 비교 x
        return answer;
    }

    public static void main(String[] args) {
        Section1_7 main = new Section1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution3(str));
    }
}
