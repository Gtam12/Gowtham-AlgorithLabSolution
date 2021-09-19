package com.greatlearning.dsa2;

import java.util.Scanner;

public class MinimumNote {

	private static Sort ms = new Sort();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of denominations");
		int numberOfDenominations = sc.nextInt();

		int[] denominations = new int[numberOfDenominations];

		System.out.println("Enter Denominations");

		for (int i = 0; i < denominations.length; i++) {

			denominations[i] = sc.nextInt();

		}

		System.out.println("Please enter the amount");

		int amount = sc.nextInt();

		ms.sort(denominations, 0, denominations.length - 1);

		int[] numArray = new int[numberOfDenominations];

		for (int i = 0; i < denominations.length; i++) {

			numArray[i] = (int) amount / denominations[i];
			amount = amount % denominations[i];

		}

		if (amount != 0) {
			System.out.println("Not Possible to pay");
		} else {

			for (int i = 0; i < denominations.length; i++) {
				System.out.println(denominations[i] + " : " + numArray[i]);
			}
		}

	}

}
