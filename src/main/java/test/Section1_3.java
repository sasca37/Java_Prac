package test;

import java.util.Scanner;

public class Section1_3 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;  // 가장 작은 정수 값
        String[] s = str.split(" "); // 공백 구분
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int m = 0;
        int pos ;
        while ((pos = str.indexOf(' ')) != -1) { //공백을 만났을 때
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) {  //마지막 단어
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Section1_3 main = new Section1_3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(main.solution2(str));
    }
}
