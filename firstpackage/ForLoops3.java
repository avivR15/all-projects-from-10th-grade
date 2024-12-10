package firstpackage;

import java.util.Random;
import java.util.Scanner;

public class ForLoops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loops
		
		Scanner s = new Scanner(System.in);
		int sumA = 0, sumB = 0, sumC = 0, num, counter, sum, girls, boys;
		/*
		/*task1
		A)
		1. 8
		2. 6
		3. 3
		4. 0
		5. 11
		6. 7
		7. 0
		
		B)
		1. 0
		2. 1
		3. 0
		
		*/
		/*
		//task2
		System.out.println("task2");
		int over2500;
		String together = "";
		for (int i = 1 ; i <= 8 ; i++) {
			System.out.println("Enter the price of computer number " + i);
			over2500 = s.nextInt();
			if (over2500 > 2500 && together == "")
				together += over2500;
			else if (over2500 > 2500)
				together = together + ", " + over2500;
		
		}
		System.out.println("the prises of all the computers that cost over 2500 shekels is: " + together);
		
		//task3
		System.out.println("task3");
		int min, max;
		int minPlacement = 1 ,maxPlacement = 1;
		System.out.println("Enter 10 numbers");	
		num = s.nextInt();
		min = num;
		max = num;
		for (int i = 2 ; i <= 10 ; i++) {
			num = s.nextInt();
			//A
			if (num < min) {
				min = num;
				minPlacement = i;}
			//B
			if (num > max) {
				max = num;
				maxPlacement = i;}
			}
		System.out.println(min + " is the minimum number and its position is " + minPlacement);
		System.out.println(max + " is the maximum number and its position is " + maxPlacement);
		
		//task4
		System.out.println("task4");
		int FirstNum = 0;
		counter = 1;
		System.out.println("Enter 11 numbers");
		for (int i = 1 ; i <= 11 ; i++) {
			num = s.nextInt();
			if (i == 1)
				FirstNum = num;
			if (FirstNum == num)
				counter++;
		}
		System.out.println(FirstNum + " repeats itself " + counter + " times");
		
		//task5
		System.out.println("task5");

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
		//A
		System.out.println("in " + sumA + " of the clases there is too much students");
		//B
		System.out.println("in " + sumB + " of the clases there is too few students");
		//C
		System.out.println("in " + sumC + " of the clases there is more boys then girls");
		
		//task6
		System.out.println("task6");
		int sum1 = 0, sum2 = 0, counter1 = 0, counter2 = 0, number;
		for (int i = 1 ; i <= 15 ; i++) {
			System.out.println("Enter a number (" + i + " out of 15)");
			number = s.nextInt();
			//A
			if (number % 2 == 0) {
				sum1 += number;
				counter1++;
				}
			//B
			if (number % 5 == 0) {
				sum2 += number;
				counter2++;
				}}
		double EvenAverage = sum1 / (double)counter1;
		double DividedByFiveAverage = sum2 / (double)counter2;
		System.out.println("The everage of all the even numbers is " + EvenAverage);
		System.out.println("The everage of all the numbers that divided by five is " + DividedByFiveAverage);
		//NuN - אם המספרים לא זוגיים ולא מתחלקים בחמש אז הממוצעים בסוף הם
		
		//task7
		System.out.println("task7");
		sum = 1;
		System.out.println("choose a positive integer number for assembly");
		int n = s.nextInt();
		for (int i = 1 ; i <= n ; i++)
			sum *= i;
		System.out.println(n + "! = " + sum);
		
		
		
		//task8
		System.out.println("task8 (one of the numbers must be greater then 4!)");
		int sumGreaterThen4 = 0, counterGreaterThen4 = 0 , sumMultipication = 1;
		sum = 0;
		System.out.println("enter 10 numbers");
		for (int i = 1 ; i <= 10 ; i++) {
			num = s.nextInt();
			sum += num;
			sumMultipication *= num;
			if (num > 4) {
				sumGreaterThen4 += num;
				counterGreaterThen4++;}}
		double Average = (double)sum / 10.0;
		//a
		System.out.println("A");
		System.out.println("the average of all the numbers is " + (sum / 10));
		//b
		System.out.println("B");
		System.out.println("the average of all the numbers that grater then 4 is " + (sumGreaterThen4 / counterGreaterThen4));
		//c
		System.out.println("C");
		System.out.println("the multipication of all the numbers is " + sumMultipication);
		
		
		//task9
		System.out.println("task9");
		sum = 0;
		int i, Sum = 0, Precipitation = 0, Less = 0, numLess = 0;
		for (i = 1 ; i <= 12 ; i++) {
			System.out.println("Enter the amount of precipitation that fell in month " + i + " of the year ");
			Precipitation = s.nextInt();
			Sum += Precipitation;
			if (i == 1) {
				numLess = 1;
				Less = Precipitation;}
			else
				if (Precipitation < Less) {
					Less = Precipitation;
					numLess = i;}}
		Average = sum / 12.0;
		//A
		System.out.println("The everage precipitation in the year is " + Average);
		//B
		System.out.println("The number of the month in which the precipitation was lowest is " + numLess);
		//C
		System.out.println("the precipitation at the month when the precipitation was the lowest is " + Less);
		
		//task10
		System.out.println("task10");
		int temperture, secondLess = 0;
		sum = 0; Less = 0;
		for (i = 1 ; i <= 7 ; i++) {
			System.out.println("Enter the temperture in day number " + i + " of the week");
			temperture = s.nextInt();
			sum += temperture;
			if (i == 1) {
				Less = secondLess = 1;
				numLess = temperture;}
			else
				if (temperture < numLess) {
					secondLess = Less;
					Less = i;
					numLess = temperture;}}
			
		Average = sum / 7.0;
		//a
		System.out.println("the average temperture on this week is " + Average);
		//b
		System.out.println("the tow days with the lowest temperture is day number " + Less + " and day number " + secondLess);
		*/
		
		
		//task11
		System.out.println("task11");
		
		//task12
		System.out.println("task12");
		Random dice = new Random();
		int number;
		
		//D
		number = dice.nextInt(51);
		System.out.println(number);
		
		//E
		number = 15 + dice.nextInt(56);
		System.out.println(number);
		
		//F
		number = -10 + dice.nextInt(101);
		System.out.println(number);
		
		//G
		number = 100 + dice.nextInt(900);
		System.out.println(number);
		
		//H
		number = 100 + (2 * dice.nextInt(449));
		System.out.println(number);
		
		//I
		number = 101 + (2 * dice.nextInt(447));
		System.out.println(number);
		
		
		
		//task13
		System.out.println("task13");
		int greatestNumOfTests = 0;
		for (int student = 1 ; student <= 17 ; student++) {
			System.out.println("how much tests did student number " + student + " did before he got his license?");
			int numOfTests = s.nextInt();
			if (student == 1)
				greatestNumOfTests = numOfTests;
			else if (student > 1)
				if (numOfTests > greatestNumOfTests)
					greatestNumOfTests = numOfTests;}
		System.out.println("the greatest number of test that student did is " + greatestNumOfTests);
				
				
		
		
		//task14
		System.out.println("task14");
		
		//task15
		System.out.println("task15");
		
		//task16
		System.out.println("task16");
		
		//task17
		System.out.println("task17");
		
		//task18
		System.out.println("task18");
		
	}

}
