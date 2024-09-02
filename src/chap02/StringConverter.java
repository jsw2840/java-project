package chap02;

public class StringConverter {
    public static void main(String[] args) {
        // String -> 숫자로 변환
        String str = "12345"; // int/Integer
        int primitiveStr = Integer.parseInt(str);
        Integer wrapperStr = Integer.valueOf(str);

        int sum = primitiveStr + 1;

        // String -> long/Long
        long primitiveLong = Long.parseLong(str);
        Long wrapperLong = Long.valueOf(str);

        // String -> double/Double
        String strDouble = "10000.345";
        double primitiveDouble = Double.parseDouble(strDouble);
        Double wrapperDouble = Double.valueOf(strDouble);

        // String -> float/Float
        String strFloat = "10000.345";
        float primitiveFloat = Float.parseFloat(strFloat);
        Float wrapperFloat = Float.valueOf(strFloat);

        int intValue = 10; // 10 -> "10"
        String s1 =intValue + "" ;
        String s2 = Integer.toString(intValue);
        String s3 = String.valueOf(intValue);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3= " + s3);
    }
}
