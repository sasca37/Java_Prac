package test;

import java.util.Scanner;

public class Section1_12 {

    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*','0'); // 0부터 7전 까지
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num; // 문자로 형변환
            s = s.substring(7);
            System.out.println(s);
        }

        return answer;
    }

    public static void main(String[] args) {
        Section1_12 main = new Section1_12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(n, str));
    }
}
