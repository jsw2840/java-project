package chap03;

public class StringAppendSample {
    public static void main(String[] args) {

        String str = "Hello" + 123 + 456;
        System.out.println(str);

        String str2 = 123 + 456 + "Hello";
        System.out.println(str2);
    }
}
