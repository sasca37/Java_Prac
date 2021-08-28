package test2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Section2_8 {

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1; //1등으로 시작
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    cnt ++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_8 main = new Section2_8();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(count, arr)) {
            System.out.print(x+" ");
        }
    }
}
