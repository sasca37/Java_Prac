package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Section3_1 {

    public ArrayList<Integer> solution(int n1, int n2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while (p1 < n1) answer.add(arr1[p1++]);
        while (p2 < n2) answer.add(arr1[p2++]);

        return answer;
    }

    public static void main(String[] args) {
        Section3_1 main = new Section3_1();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int x : main.solution(n1, n2, arr1, arr2)) System.out.println(x + " ");
    }
}
