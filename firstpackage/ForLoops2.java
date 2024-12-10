package firstpackage;

import java.util.Scanner;

public class ForLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loops
		
		Scanner s = new Scanner(System.in);
		
		//task1
		System.out.println("task1");
		int sum = 0;
		int cost;
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("Enter the cost of TV number " + i + " in the store");
			cost = s.nextInt();
			sum += cost;
		}
		System.out.println("The cost of all the 10 TV's in the store is " + sum);
		
		//task2
		System.out.println("task2");
		sum = 1;
		for (int i = 1 ; i <= 10 ; i++)
			sum *= i;
		System.out.println("The multiplication of all the natural numbers between 1 and 10 is " + sum);
		
		//task3
		System.out.println("task3");
		sum = 1;
		System.out.println("choose a number for assembly");
		int n = s.nextInt();
		for (int i = 1 ; i <= n ; i++)
			sum *= i;
		System.out.println(n + "! = " + sum);
		
		//task4
		System.out.println("task4");
		sum = 0;
		for (int i = 1 ; i <= 8 ; i++) {
			System.out.println("Type a character on the keyboard");
			char tav = s.next().charAt(0);
			if (tav == 'A')
				sum++;}
		System.out.println("The letter \"A\" was typed " + sum + " times (out of 8)");
		
		//task5
		System.out.println("task5");
		int num = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("Enter the cost of TV number " + i + " in the store");
			cost = s.nextInt();
			if (cost > 3000)
				num++;}
		System.out.println("The number of tv's that cost over 3000 shekels in the store is " + num);
		
		//task6
		System.out.println("task6");
		num = 0;
		int grade;
		for (int i = 1 ; i <= 5 ; i++) {
			System.out.println("Enter the grade of student " + i);
			grade = s.nextInt();
			if (grade > 80)
				num++;}
		System.out.println("The number of students that past the test is " + num + " (out of 5)");
		
		//task7
		System.out.println("task7");
		num = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println("Enter the cost of computer number " + i + " in the store");
			cost = s.nextInt();
			if (cost > 2500)
				num++;}
		System.out.println("The number of computer's that cost over 2500 shekels in the store is " + num);
		
		//task8
		System.out.println("task8");
		int sumA = 0;
		int sumB = 0;
		int sumC = 0;
		int boys;
		int girls;
		for (int i = 1 ; i <= 20 ; i++) {
			System.out.println("How many boys enrolled in class number " + i);
			boys = s.nextInt();
			System.out.println("How many girls enrolled in class number " + i);
			girls = s.nextInt();
			if (boys + girls >= 41)
				sumA++;
			else if (boys + girls < 15)
				sumB++;
			if (boys > girls)
				sumC++;
			}
		//a
		System.out.println("in " + sumA + " of the clases there is too much students");
		//b
		System.out.println("in " + sumB + " of the clases there is too few students");
		//c
		System.out.println("in " + sumC + " of the clases there is more boys then girls");
		
		//task9
		System.out.println("task9");
		sumA = 0;
		sumB = 0;
		for (int i = 1 ; i <= 7 ; i++) {
			System.out.println("How many students in class number " + i);
			num = s.nextInt();
			sumA += num;
			if (num > 35)
				sumB++;}
		//a
		System.out.println("in all of the clases there is " + sumA + " students");
		//b
		System.out.println("in " + sumB + " of the clases there is more then 35 students");
		
		//task10
		System.out.println("task10");
		double Sum = 0;
		double temperature;
		for (int i = 1 ; i <= 7 ; i++) {
			System.out.println("Enter the temperature in day number " + i);
			temperature = s.nextInt();
			Sum += temperature;}
		System.out.println("The everage temperature in the week is " + Sum / 7.0);
		
		//task11
		System.out.println("task11");
		int Precipitation;
		Sum = 0;
		for (int i = 1 ; i <= 12 ; i++) {
			System.out.println("Enter the amount of precipitation that fell in month " + i + " of the year ");
			Precipitation = s.nextInt();
			Sum += Precipitation;}
		System.out.println("The everage precipitation in the year is " + Sum / 12);
		
		//task12
		System.out.println("task12");
		sum = 0;
		num = 0;
		int number;
		for (int i = 1 ; i <= 15 ; i++) {
			System.out.println("Enter a number (" + i + " out of 15)");
			number = s.nextInt();
			if (number % 2 == 0) {
				sum += number;
				num++;
				}}
		double Average = sum / num;
		System.out.println("The everage of all the even numbers is " + Average);
		
	}

}
