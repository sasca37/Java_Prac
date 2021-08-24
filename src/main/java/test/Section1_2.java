package test;

import java.util.Scanner;

public class Section1_2 {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (65<=x && x<=90) {
                answer += Character.toLowerCase(x);
            }
            else if (97<=x && x<=122){

                answer+= Character.toUpperCase(x);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section1_2 main = new Section1_2();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print(main.solution(name));
    }
}
