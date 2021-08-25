package test;

import java.util.Locale;
import java.util.Scanner;

public class Section1_8 {

    public String solution(String str) {
        String answer = "NO";
        // 정규 표현식
        str = str.toUpperCase().replaceAll("[^A-Z]", " ");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Section1_8 main = new Section1_8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
