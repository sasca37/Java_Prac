package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Section2_6 {

    public boolean isPrime(int num) {
        if(num == 1) return false;
        for (int i = 2; i < num; i++) {
            if(num%i==0) return false;
        }
        return true;
    }

    public ArrayList<Integer> solution(int cnt, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        // res = res * 10 +t
        for (int i = 0; i < cnt; i++) {
            int res = 0;
            int t= 0;
            int tmp = arr[i];
            while (tmp > 0) {
                t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp /10;
            }
            if(isPrime(res))answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Section2_6 main = new Section2_6();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : main.solution(cnt, arr)) {
            System.out.print(x+" ");
        }
    }


}
