package chapter2.exercises;

import java.util.Random;

public class LotteryPrinter {

	public static void main(String[] args) {
		Random number = new Random();
		System.out.println("Play this combination - it'll make you rich!");
		System.out.print(number.nextInt(49) + 1 + " ");
		System.out.print(number.nextInt(49) + 1 + " ");
		System.out.print(number.nextInt(49) + 1 + " ");
		System.out.print(number.nextInt(49) + 1 + " ");
		System.out.print(number.nextInt(49) + 1 + " ");
		System.out.print(number.nextInt(49) + 1);
       
	}

}
