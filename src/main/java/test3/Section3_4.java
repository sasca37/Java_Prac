package test3;

import java.util.Scanner;

public class Section3_4 {

    public int solution(int n, int sum, int[] arr) {
        int answer = 0;
        int count = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            count += arr[rt];
            if(count == sum) answer ++;
            while (count >= sum) {
                count -= arr[lt++];
                if(count == sum) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Section3_4 main = new Section3_4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, sum, arr));
    }
}
