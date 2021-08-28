package test2;

import java.util.Scanner;

public class Section2_5 {

    public int solution(int n) {

        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) { // j가 i의 배수만큼 돌 수 있도록
                    ch[j] = 1;
                }
            }
        }

        return answer;

    }
    public static void main(String[] args) {

        Section2_5 main = new Section2_5();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        System.out.println(main.solution(cnt));
    }
}
