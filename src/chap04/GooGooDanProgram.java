package chap04;

public class GooGooDanProgram {
	public static void main(String[] args) {
		//구구단
		/*
		2 4 6 ... 18
		3 6 9 ... 27
		*/

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}

	}
}
