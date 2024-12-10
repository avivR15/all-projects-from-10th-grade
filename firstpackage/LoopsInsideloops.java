package firstpackage;

import java.util.Scanner;

public class LoopsInsideloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);


		//task1
		System.out.println("task1");
		int sum = 0;
		System.out.println("Enter a number of days");
		int NumOfDays = s.nextInt();
		for (int i = 1 ; i <= NumOfDays ; i++) {
			int sumPerDay = 0;
			for (int j = 1 ; j <= 20 ; j++) {
				System.out.println("Enter the amount of fuel consumed by station driver number " + j);
				int fuel = s.nextInt();
				sumPerDay+=fuel;}
			sum+=sumPerDay;
			System.out.println("in day number " + i + ", The total amount of fuel consumed by station drivers is " + sumPerDay);}
		System.out.println("The amount of fuel consumed throughout the period is " + sum);
		System.out.println(/*line space*/);


		//task2
		System.out.println("task2");
		int max = 0, price = 0, sumPrices;
		for (int store = 1 ; store <= 8 ; store++) {
			sumPrices = 0;
			System.out.println("Shop number " + store + "...");
			for (int pen = 1 ; pen <= 5 ; pen++) {
				System.out.println("How much do pen number " + pen + " cost?");
				price = s.nextInt();
				sumPrices += price;
			}
			if (store == 1)
				max = sumPrices;	
			max = Math.max(max,sumPrices);
		}
		System.out.println("The price of all the pens in the most expensive shop is " + max + " shekels");


		//task3
		System.out.println("task3");
		int numMinAvg = 0;
		double Avg = 0, minAvg = 0;
		sum = 0;
		for (int student = 1 ; student <= 40 ; student++) {
			int sumGrades = 0;
			for (int subject = 1 ; subject <= 6 ; subject++) {
				System.out.println("Enter grade number " + subject + " for student number " + student);
				int gradePerSubject = s.nextInt();
				sumGrades += gradePerSubject;
			}
			Avg = (double)sumGrades / 6.0;
			if (student == 1) {
				minAvg = Avg;
				numMinAvg = 1;}
			else if (student > 1) {
				if (Avg < minAvg) {
					minAvg = Avg;
					numMinAvg = student;}}
			System.out.println("The avarage of the student number " + student + " is " + Avg + ", congragilations");
		}
		System.out.println("The lowest avarage in the class is " + minAvg + " and this average belongs to student number " + numMinAvg);


		//task4
		System.out.println("task4");
		int AvgLessThen100 = 0, peoples = 0;
		Avg = 0;
		for (int hospital = 1 ; hospital <= 5 ; hospital++) {
			sum = 0;
			for (int day = 1 ; day <= 7 ; day++) {
				System.out.println("Enter the mount of peoples went to the hospital in day number " + day);
				peoples = s.nextInt();
				sum += peoples;
			}
			Avg = (double)sum / 7.0;
			System.out.println("The average of the peoples that went to the hospital number " + hospital + " per day is " + Avg);
			if (Avg < 100)
				AvgLessThen100++;
		}
		System.out.println("In " + AvgLessThen100 + " of the hospitals, the average of the peoples that went to the hospital per day was less then 100 peoples");


		//task5
		System.out.println("task5");
		for (int i = 1 ; i <= 10 ; i++) {
			for (int j = 1 ; j <= 10 ; j++) {
				int multiplication = i * j;

				//Aligning the numbers to straight columns
				if ((multiplication < 100 && j == 10) || (multiplication < 10))
					System.out.print(" ");

				System.out.print(multiplication + " ");
			}
			System.out.println();
		}
		System.out.println();


		//task6
		System.out.println("task6");
		int NumOfRows = 0, row = 1;
		int stars, spaces;

		//A
		System.out.println("Enter a number of rows");
		NumOfRows = s.nextInt();
		stars = 1;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(int j = 1 ; j <= stars ; j++) {
				System.out.print("*");}
			stars++;
			System.out.println();}
		System.out.println();

		//B
		System.out.println("Enter a number of rows");
		NumOfRows = s.nextInt();
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = row - 1 ; spaces <= row*2 - 3 ; spaces++)
				System.out.print(" ");
			for(stars = NumOfRows - row ; stars >= 0 ; stars--)
				System.out.print("*");
			System.out.println();}
		System.out.println();

		//C
		System.out.println("Enter a number of rows");
		NumOfRows = s.nextInt();
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = NumOfRows - row - 1 ; spaces >= 0 ; spaces--)
				System.out.print(" ");
			for(stars = row ; stars <= row*2 - 1 ; stars++)
				System.out.print("*");
			System.out.println();}
		System.out.println();

		//D
		System.out.println("Enter a number of rows");
		int N = s.nextInt();
		stars = 1;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(int j = 1 ; j <= stars ; j++) {
				System.out.print(j + " ");}
			stars++;
			System.out.println();}
		System.out.println();


		//task7
		System.out.println("task7");
		boolean bool = true;
		double i;
		for (i = 1; i <= 3000 ; i++) {
			bool = true;
			for (double division = 2; division <= i - 1 ; division++)
				if (i / division == (int)(i / division)) {
					bool = false;}
			if (bool)
				System.out.println((int)i);
		}
		System.out.println();

		//another way (for task7)...
		boolean isPrimeNumber = false;
		for (i = 1 ; i <= 3000 ; i++) {
			isPrimeNumber = true;
			for (int j = 2 ; j <= i/2 ; j++)
				if (i != j && i % (j) == 0)
					isPrimeNumber = false;
			if(isPrimeNumber)
				System.out.println((int)i);
		}
		System.out.println();


		//task8
		System.out.println("task8");
		System.out.println("Enter a numbers (for stopping press 0 twice)");
		int Num = s.nextInt();
		int countSeries = 0, countNums = 0, countMax = 0;
		while (Num != 0) {
			countSeries++;
			while (Num != 0) {
				countNums++;
				countMax = Math.max(countMax, countNums);
				Num = s.nextInt();}
			countNums = 0;
			Num = s.nextInt();}
		System.out.println("There are " + countSeries + " series, and the longest series had " + countMax + " terms.");


		//task9
		System.out.println("task9");
		int sequenceLen = 1, sequenceMax = 0, previousNum;
		System.out.println("Enter numbers (for stopping press -1)");
		Num = s.nextInt();
		previousNum = Num + 1;

		while(Num != -1) {
			//בדיקת תקינות קלט (מספרים שלמים וחיוביים)
			while(Num < 0 && Num != -1) {
				System.out.println("The number must be greater then 0, choose a new number");
				Num = s.nextInt();}

			if (previousNum == Num) {
				sequenceLen++;
				sequenceMax = Math.max(sequenceMax, sequenceLen);}
			else 
				sequenceLen = 1;
			previousNum = Num;
			Num = s.nextInt();
		}
		System.out.println("The greatest series of simular numbers" + sequenceMax);

	}

}