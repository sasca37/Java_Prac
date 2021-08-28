package test2;

import java.util.*;

public class Section2_4 {

    public ArrayList<Integer> solution(int cnt) {
        ArrayList<Integer> answer = new ArrayList<>();
        int num = 1;
        answer.add(num);
        answer.add(num);
        for (int i = 2; i < cnt; i++) {
            num = answer.get(i - 1) + answer.get(i - 2);
            answer.add(num);
        }
        return answer;
    }

    public static void main(String[] args) {
        Section2_4 main = new Section2_4();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for (int x : main.solution(cnt)) {
            System.out.print(x+ " ");
        }
    }


}
