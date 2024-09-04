package chap04;

import java.util.ArrayList;

public class ArgumentArraySample {
	public static void main(String[] args) { //10 12 13 14 18 20
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]); // args[0] ~ gargs[5]
		}

		// for each문 변환
		for (String arg : args) {
			System.out.println(arg);
		}

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		for (Integer i : list) {
			System.out.println(i);
		}
		
	}
}
