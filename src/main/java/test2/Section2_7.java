package test2;

import java.util.Scanner;

public class Section2_7 {

    public int solution(int cnt, int[] arr) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                answer += count;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_7 main = new Section2_7();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(cnt, arr));
    }
}
