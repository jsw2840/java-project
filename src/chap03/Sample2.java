package chap03;

public class Sample2 {
    public static void main(String[] args) {
        int x1 = 51;
        double x2 = 50.34;

        int result1 = (int)(x1-x2);
        int result2 = x1-(int)x2;
        System.out.println(result1);
        System.out.println(result2);

        // char 타입
        char c1 = 'A' + 1;   // 'B' (유니코드 66은 문자 B)
        char c2 = 'A';
        //char c3 = c2 + 1;   // 에러
    }
}
