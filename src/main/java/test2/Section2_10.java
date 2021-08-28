package test2;

import java.util.Arrays;
import java.util.Scanner;

public class Section2_10 {

    public int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                // 상하좌우 상 : -1,0 , 하 : +1, 0 , 좌 : 0, -1, 우 : 0, +1
                int a = arr[i-1][j];
                int b = arr[i + 1][j];
                int c = arr[i][j - 1];
                int d = arr[i][j + 1];
                if (arr[i][j] > a && arr[i][j] > b && arr[i][j] > c && arr[i][j] > d) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_10 main = new Section2_10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < n+1; j++) {
                arr[i][j] =sc.nextInt();
            }
        }

        System.out.println(main.solution(n, arr));
    }
}
