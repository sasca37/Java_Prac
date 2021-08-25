package test;

import java.util.Scanner;

public class Section1_9 {

    public int solution(String str) {
        str = str.replaceAll("[^0-9]", "");
        int a = Integer.parseInt(str);
        return a;
    }

    public int solution2(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (48 <= x && x <= 57) { //알파벳인경우 (48 :0 , 57:9)
                answer = answer * 10 + (x-48);
            }
        }

        return answer;
    }

    public int solution3(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) { // 숫자면
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        Section1_9 main = new Section1_9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution3(str));
    }
}

