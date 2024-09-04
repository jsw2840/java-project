package chap04;

public class WhileLoop {
	public static void main(String[] args) {
		int index = 1;
		while (index <= 5) {
			System.out.println(index);
			index++;
		}

		// continue 포함
		int num = 0;
		while (num <= 60) {
			num++;
			if (num % 3 != 0) {
				continue;
			}
			System.out.println(num);
		}

		// continue 없이
		while (num <= 60) {
			num++;
			if (num % 3 == 0) {
				System.out.println(num);
			}
		}

	}
}
