package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Section2_1 {

    public ArrayList<Integer> solution(int cnt, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < cnt; i++) {
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_1 main = new Section2_1();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(cnt, arr)) {
            System.out.print(x + " ");
        }
    }
}
