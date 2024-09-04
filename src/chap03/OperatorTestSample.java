package chap03;

public class OperatorTestSample {
	public static void main(String[] args) {
		//삼항연산자
		int score = 95;
		char grade = (score > 90) ? 'A' : 'B';

		String answer = (score % 2 == 0) ? "짝수" : "홀수";
		System.out.println(answer);

		int a = 5;
		int b = 7;

		// 값이 같다면 a 반환
		int result = (a >= b) ? a : b;
		System.out.println(result);

		String result2 = (score >= 60) ? "합격" : "불합격";
	}
}
