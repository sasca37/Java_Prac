package test2;

import java.util.Scanner;

public class Section2_11 {

    public int solution(int n, int[][] arr) {
        int answer = 0, max=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <=n; j++) {
                for (int k = 1; k <=5; k++) { //학년 1~5
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break; //학년 처리이기 때문에 브레이크
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_11 main = new Section2_11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6]; // 1~5학년 고정
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(main.solution(n, arr));
    }
}
