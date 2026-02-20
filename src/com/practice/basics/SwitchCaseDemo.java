package com.practice.basics;

import java.util.*;

public class SwitchCaseDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int Day = sc.nextInt();

		String dayName;

		switch (Day) {
		case 1:
			dayName = "Monday";
			break;

		case 2:
			dayName = "Tuesday";
			break;

		case 3:
			dayName = "Wednesday";
			break;

		case 4:
			dayName = "Thursday";
			break;

		case 5:
			dayName = "Friday";
			break;

		case 6:
			dayName = "Saturday";
			break;

		case 7:
			dayName = "Sunday";
			break;

		default:
			dayName = "Invalid Day";
			break;
		}

		System.out.println("The Day is : " + dayName);
		sc.close();

	}
}
