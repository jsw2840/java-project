package chap04;

/*
 * for문을 이용해서 1~50 까지 출력해보기
 * */
public class ForLoop {
	public static void main(String[] args) {
		//1~50까지 출력
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}

		//짝수만 출력
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		//홀수만 출력
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		//짝수만 출력
		for (int j = 2; j <= 50; j += 2) {
			System.out.println(j);
		}

		//홀수만 출력
		for (int j = 1; j <= 50; j += 2) {
			System.out.println(j);
		}
	}
}
