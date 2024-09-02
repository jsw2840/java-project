package chap02;

public class Sample {
    public static void main(String[] args) {
        // String 참조 자료형 : new 예약어를 사용해서 변수를 초기화.
        // String 예외
        String str1 = "실제값"; // 예외
        String str2 = new String("실제값");
        String str3 = "실제값";
        String str4 = new String("실제값");

        System.out.println(str1 == str2); //false
        System.out.println(str1 == str3); //true
        System.out.println(str2 == str4); //false

        int a = 10;
        int b = 10;
        System.out.println(a == b); //true


        // true
        str1.equals(str2);

        //박싱 (int -> Integer)
        int z = 10;
        Integer a2 = Integer.valueOf(z);

        //오토박싱 (int -> Integer)
        Integer a3 = z;
    }
}
