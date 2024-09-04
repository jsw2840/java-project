package chap04;

/*
 * 0~ 60 까지 숫자 중 3의 배수만 출려갛기
 *  (continue 꼭 사용!)
 */
public class ForContinueLoop {
	public static void main(String[] args) {
		// 0 ~ 60 중에 3의 배수 출력
		for (int i = 0; i < 60; i++) { // ㅑ = 0 ~ 59
			int value = i + 1;
			if (value % 3 != 0) {
				continue;
			}
			System.out.println(value + "는 3의 배수");
		}

		for (int i = 0; i < 60; i++) { // ㅑ = 0 ~ 59
			int value = i + 1;
			if (value % 3 == 0) {
				System.out.println(value + "는 3의 배수");
			}
		}
	}
}
