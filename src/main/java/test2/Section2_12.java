package test2;

import java.util.Scanner;

public class Section2_12 {

    int solution(int studentNum, int testNum, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <=studentNum; i++) { //멘토
            for (int j = 1; j <=studentNum; j++) { //멘티
                if (i != j) {
                    int cnt = 0;
                    for (int test = 0; test < testNum; test++) {
                        int mento = 0;
                        int menti = 0;
                        for (int s = 0; s < studentNum; s++) {
                            if (arr[test][s] == i) mento = s;
                            if (arr[test][s] == j) menti = s;
                        }
                        if (mento < menti) cnt++;
                    }
                    if (cnt == testNum) {
                        answer++;
                    }
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Section2_12 main = new Section2_12();
        Scanner sc = new Scanner(System.in);
        int studentNum = sc.nextInt();
        int testNum = sc.nextInt();
        int[][] arr = new int[testNum][studentNum];
        for (int i = 0; i < testNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(studentNum, testNum, arr));

    }
}
