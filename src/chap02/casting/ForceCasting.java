package chap02.casting;

public class ForceCasting {
    public static void main(String[] args) {
        // long -> int
        long longValue = 300;
        int intValue = (int) longValue;  // intValue는 300이 그대로 저장

        // double -> int
        double pi = 3.14;
        int convertedInt = (int) pi;   // pi는 정수 부분인 3만 저장
        System.out.println("convertedInt = " + convertedInt);
    }
}
