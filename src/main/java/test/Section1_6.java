package test;

import java.util.Scanner;

public class Section1_6 {

    public String solution(String str) {

        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            // indexOf : 앞에서부터 처음 발견되는 인덱스를 반환, 없을경우 -1 반환
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;


    }

    public static void main(String[] args) {
        Section1_6 main = new Section1_6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
