package chap03;

public class Sample {
    public static void main(String[] args) {
        // 단항연산자 - 증감 전/후위 연산자
        int x = 14;
        int result = --x;
        System.out.println(result);
        System.out.println(--x);

        int a= 10;
        int b= 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        System.out.println(a%b);

        int result1 = a%b;
        System.out.println(result1);

        byte z = 45;
        byte y = 67;

        int result2 = z+y;
        System.out.println(result2);

        byte result3 = (byte) (z+ y);

        int x2 = 40;
        float y2 = 50.34F;

        int result4 = (int) (x2 + y2);
        float result5 =  (x2 + y2);

        int x3 = 40;
        double y3 = 50.34;

        int intResult = (int) (x3+y3);
        double doubleResult = x3+y3;

    }
}
