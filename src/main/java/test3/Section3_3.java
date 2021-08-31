package test3;

import java.util.Scanner;

public class Section3_3 {

    public int solution(int n, int continueCount, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < continueCount; i++) sum += arr[i];
        answer = sum;
        for (int i = continueCount; i < n; i++) {
            sum += (arr[i] - arr[i - continueCount]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public static void main(String[] args) {
        Section3_3 main = new Section3_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int continueCount = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, continueCount, arr));
    }
}
