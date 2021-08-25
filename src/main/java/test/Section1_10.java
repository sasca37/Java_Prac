package test;

import java.util.Scanner;

public class Section1_10 {
    public int[] solution(String str1, char str2) {
        int[] answer = new int[str1.length()];
        int p = 1000;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2) {
                p = 0;
            }
            else {
                p++;
            }
            answer[i] = p;
        }
        p = 1000;
        for (int i = str1.length() - 1; i > -1; i--) {
            if (str1.charAt(i) == str2) {
                p = 0;
            }
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section1_10 main = new Section1_10();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char str2 = sc.next().charAt(0);
        for (int x : main.solution(str1, str2)) {
            System.out.print(x+" ");
        }

    }
}
