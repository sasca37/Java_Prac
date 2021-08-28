package test2;

import java.util.Scanner;

public class Section2_2 {

    public int solution(int n, int[] arr) {
        int min = 0;
        int cnt = 0;
        for (int x : arr) {
            if (x > min) {
                cnt ++;
                min = x;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Section2_2 main = new Section2_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, arr));
    }
}
