package test3;

import java.util.Scanner;

public class Section3_5 {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int lt = 1;
        int rt = 1;
        int count = 0;
        for (rt = 1; rt < n; rt++) {
            count += arr[rt];
            if (count == n) {
                answer++;
            }
            while (count >= n) {
                count -= arr[lt++];
                if (count == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Section3_5 main = new Section3_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.out.println(main.solution(n, arr));
    }
}
