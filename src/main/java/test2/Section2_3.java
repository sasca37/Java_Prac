package test2;

import java.util.*;

public class Section2_3 {

    public ArrayList<String> solution(int cnt, int[] a, int[] b) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            if (a[i] - b[i] == 1 || a[i] - b[i] == -2) {
                answer.add("A");
            } else if (a[i] == b[i]) {
                answer.add("D");
            } else {
                answer.add("B");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_3 main = new Section2_3();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] a = new int[cnt];
        int[] b = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            b[i] = sc.nextInt();
        }

        for (String x : main.solution(cnt, a, b)) {
            System.out.println(x);
        }
    }
}
