package com.jocata.star.practisesecond;

import java.util.Scanner;

public class pr {

	public static void main(String[] args) {
		int temp;
		Boolean str = true;
		Scanner sca = new Scanner(System.in);
		String n = sca.nextLine();
		System.out.println("eneter the prime number ");
		int num = n.length();

		for (int i = 2; i < num / 2; i++) {

			temp = num % i;

			if (temp == 0) {

				str = false;
				break;

			}

		}
		if (str)
			System.out.println("prime");

		else
			System.out.println("not");

	}

}
