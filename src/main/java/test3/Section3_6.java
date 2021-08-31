package test3;

import java.util.Scanner;

public class Section3_6 {

    public int solution(int length, int n, int[] arr) {
        int answer = 0;
        int cnt =0;
        int lt = 0;
        for (int rt = 0; rt < length; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > n) {
                if ( arr[lt] == 0) cnt--;
                lt ++;
            }
            answer = Math.max(answer, rt - lt + 1);
            System.out.println(answer);
        }
        return answer;
    }

    public int solution2(int length, int n, int[] arr){
        int answer = 0;
        int lt = 0;
        int pointRt = 0;
        int zeroCnt = 0;
        for (int rt = 0; rt < length; rt++) {
            if (arr[rt] == 0) {
                zeroCnt++;
            }
            if (zeroCnt == n) {
                pointRt = rt-1;
            }
            if (zeroCnt != n && rt == length) {
                pointRt = length;
            }
            System.out.print(pointRt+" ");
        }
        return answer;
    }

    public static void main(String[] args) {
        Section3_6 main = new Section3_6();
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution2(length, n ,arr));
    }
}
