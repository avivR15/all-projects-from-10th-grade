package firstpackage;

import java.util.Random;
import java.util.Scanner;

public class Functions2 {


	//function1.1
	public static void printingLetters(char L1, char L2){
		for (int counter = Math.max(L1, L2) + 1 ; counter != Math.min(L1, L2) ; counter++) {
			System.out.print((char)counter + " ");
			if ((char)counter == 'z')
				counter -= 26;}
	}
	//function1.2
	public static void gettingAndPrintingLetters(){
		Scanner s = new Scanner(System.in);
		char L1 = 0,L2 = 0;
		boolean bool = true;
		while(bool) {
			L1 = s.next().charAt(0); L2 = s.next().charAt(0);
			if (L1 >= 97 && L1 <= 122 && L2 >= 97 && L2 <= 122)
				bool = false;
			else
				System.out.println("you should put a two letters.");}
		printingLetters(L1, L2);
	}


	//function2
	public static boolean devidedBy7(int a){
		boolean bool = false;
		if (a % 7 == 0)
			bool = true;
		return bool;}


	//function3.1
	public static int sumOfDigits(int num){
		boolean bool = true;
		int numOfDigits = 0;
		while (bool) {
			numOfDigits++;
			num /= 10;
			if (num == 0)
				bool = false;}
		return numOfDigits;
	}
	//function3.2
	public static boolean lastDigitsEqual(int num){
		boolean bool = false;
		if (num % 10 == num / 10 % 10)
			bool = true;
		return bool;
	}
	//function3.3
	public static boolean oddAndEquall(int num){
		boolean bool = false;
		if (sumOfDigits(num) % 2 == 1 && lastDigitsEqual(num))
			bool = true;
		return bool;
	}
	//function3.4
	public static int muchOfOddsAndEqualls(int num){
		Scanner s = new Scanner(System.in);
		int counter = 0;
		while (num != 0) {
			System.out.println("Enter another number");
			num = s.nextInt();
			System.out.println(counter);}
		if (oddAndEquall(num)) {
			counter++;
		}
		return counter;
	}



	//function4.1
	public static char transferTOLowercases(char big){
		char little = (char)(big + 32);
		return little;
	}
	//function4.2
	public static void transfercases(int num){
		Random dice = new Random();
		int D_counter = 0;
		char max = 0;
		int place = 1;
		for (int i = 1 ; i <= num ; i++) {
			char rand = (char)(65 + dice.nextInt(26));
			System.out.println("the lowercase letter for " + rand + " is: " + transferTOLowercases(rand));
			if ((char) rand == 'D')
				D_counter++;
			if (i == 1)
				max = (char)rand;
			else if (rand > (int)max) {
				max = (char)rand;
				place = i;
			}
		}
		System.out.println("The number of times the letter D was drawn is " + D_counter);
		System.out.println("The biggest letter is " + max + " and her place in the bunch of randoms lettes is " + place);
	}


	//function5
	public static void Elections(int numA, int numL){
		if (numA > numL)
			System.out.println("Aviv was choosed");
		else if (numA < numL)
			System.out.println("Lihi was choosed");
		else
			System.out.println("draw");
	}


	//function6
	public static boolean Polidrom(int num){
		int normal = num;
		boolean bool = true;
		int Length = 0;
		while(bool) {
			num/=10;
			Length++;
			if (num == 0)
				bool = false;}
		int opisite = 0;
		int rebuild = normal;
		for (int i = 0 ; Length > i ; Length--) {
			opisite += rebuild % 10 * (Math.pow(10, Length) / 10);
			rebuild/=10;}
		if (opisite == normal)
			return true;
		else
			return false;
	}


	//function7
	public static void ag(int x){
		boolean bool;
		if (x%2 == 0)
			bool = true;
		else
			bool = false;
		System.out.println(bool);}


	//function8
	public static void ah(int x){
		boolean bool;
		if (x%2 == 0)
			bool = true;
		else
			bool = false;
		System.out.println(bool);}




	//using the functions...
	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		Random dice = new Random();
		//task1
		System.out.println("task1.1");
		System.out.println("Enter a two diffrent random small letters");
		printingLetters(s.next().charAt(0), s.next().charAt(0));

		System.out.println();
		System.out.println("task1.2");
		System.out.println("Enter a two diffrent random small letters");
		gettingAndPrintingLetters();


		//task2
		System.out.println();
		System.out.println("task2.1");
		System.out.println("Enter a number");
		System.out.println(devidedBy7(s.nextInt()));

		System.out.println("task2.2");
		int sumDevideds = 0;
		int counterDevideds = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			int number = 234 + dice.nextInt(6309);
			if (devidedBy7(number)) {
				counterDevideds++;
				sumDevideds+=number;}}
		double AverageDevidings = (double)sumDevideds / (double)counterDevideds;
		System.out.println(AverageDevidings);

		//task3
		System.out.println();
		System.out.println("task3.1");
		System.out.println("Enter a number");
		System.out.println(sumOfDigits(s.nextInt()));
		System.out.println("task3.2");
		System.out.println("Enter a number");
		System.out.println(lastDigitsEqual(s.nextInt()));
		System.out.println("task3.3");
		System.out.println("Enter a number");
		System.out.println(oddAndEquall(s.nextInt()));
		System.out.println("task3.4");
		System.out.println("Enter numbers (enter 0 for stoping the loop)");
		System.out.println(muchOfOddsAndEqualls(s.nextInt()) + " of the numbers was match to the definition off \"odd-equall number\".");		


		//task4
		System.out.println();
		System.out.println("task4");
		System.out.println("Enter an upercase letter for transfer it to a lowercase letter");
		System.out.println(transferTOLowercases(s.next().charAt(0)));
		System.out.println("Enter a number");
		transfercases(s.nextInt());



		//task5
		System.out.println();
		System.out.println("task5");
		//A
		System.out.println("Enter two numbers");
		Elections(s.nextInt(),s.nextInt());
		//B
		int counterL = 0, counterA = 0;
		for (int i = 1 ; i <= 30 ; i++) {
			System.out.println("Enter the letter \"L\" for voting Lihi or \"A\" for voting Aviv");
			char cha = s.next().charAt(0);
			if (cha != 'L' && cha != 'A')
				System.out.println("the vote is illegal");
			if (cha == 'A')
				counterA++;
			else if (cha == 'L')
				counterL++;
		}
		Elections(counterA,counterL);


		//task6
		System.out.println();
		System.out.println("task6");
		//A
		System.out.println("Enter a number");
		System.out.println(Polidrom(s.nextInt()));
		//B
		int number, counter = 0;
		for (int i = 1 ; i <= 20 ; i++) {
			number = 20 + dice.nextInt(1980);
			if (Polidrom(number)) {
				counter++;
				//System.out.println(number);
			}
		}
		System.out.println(counter + " of the numbers are polidroms");


		//task7
		/*
		1.
		n=0, k=0

		2.
		אין

		3.
		אין

		4.
		n=1, k=1

		5.
		אין קלט שעבורו ללולאת הווייל יש סוף
		 */


		//task8
		System.out.println();
		System.out.println("task8");
		int grade, maxGrade = 0, maxClassGrade = 0;
		for (int i = 1 ; i <= 30 ; i++) {
			System.out.println("Enter the much of students in class number " + i);
			int students = s.nextInt();
			System.out.println("Enter the grades of all the students in this class");
			for (int j = 1 ; j <= students ; j++) {
				grade = s.nextInt();
				if (j==1)
					maxGrade = grade--;
				if (grade > maxGrade)
					maxGrade = grade;
			}
			System.out.println("the best grade in class number " + i + " is " + maxGrade);
			System.out.println();
			System.out.println();
			if (i == 1)
				maxClassGrade = maxGrade;
			else if (maxGrade > maxClassGrade)
				maxClassGrade = maxGrade;
		}
		System.out.println("the best grade in all of the class's is " + maxClassGrade);
	}

}