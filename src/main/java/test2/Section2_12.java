package test2;

import java.util.Scanner;

public class Section2_12 {

    int solution(int m, int n, int[][] arr) {
        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        Section2_12 main = new Section2_12();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(m,n,arr));

    }
}
