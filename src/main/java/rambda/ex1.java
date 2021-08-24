package rambda;

public class ex1 {
    public static void main(String[] args) {
        Sample01 f = (n) -> System.out.printf("%s", n);
        f.test("테스트");

        Sample01 f2 = new Sample01() {
            @Override
            public void test(String n) {
                System.out.printf("%s", n);
            }
        };
        f2.test("as");
    }
}

@FunctionalInterface //단 한개의 추상 메서드를 갖는 인터페이스
interface Sample01 {
    public abstract void test(String name);
}