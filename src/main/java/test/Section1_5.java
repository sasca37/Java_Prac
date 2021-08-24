package test;


import java.util.Scanner;

public class Section1_5 {

    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = s.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            }
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt ++;
                rt --;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public String solution2(String str) {
        String answer="";
        char[] x = str.toCharArray();
        int lt = 0;
        int rt = x.length-1;

        while (lt < rt) {

            if (!(65<=x[lt] && x[lt]<=90) && !(97<=x[lt] && x[lt]<=122)){
                lt++;
            } else if (!(65<=x[rt] && x[rt]<=90) && !(97<=x[rt] && x[rt]<=122)) {
                rt--;
            }
            else {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(x);

        return answer;
    }

    public static void main(String[] args) {
        Section1_5 main = new Section1_5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution2(str));
    }
}
