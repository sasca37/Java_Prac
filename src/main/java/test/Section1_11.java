package test;

import java.util.Scanner;

public class Section1_11 {

    public String solution(String str) {
        int count = 1;
        String answer = "";
        char index = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (index != str.charAt(i)) {
                if (count > 1) {
                    answer += count;
                }
                count = 1;
                index = str.charAt(i);
                answer += index;
            } else {
                count++;
                if (i == str.length()-1 && count > 1) {
                    answer +=count;
                }
            }
        }
        return answer;
    }

    public String solution2(String s) {
        String answer = "";
        s = s+ " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt =1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section1_11 main = new Section1_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution2(str));
    }
}
