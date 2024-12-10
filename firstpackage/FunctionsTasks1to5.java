package firstpackage;

import java.util.Scanner;

public class FunctionsTasks1to5 {

	//function1
	public static boolean evenOrOdd(int x){
		if (x%2 == 0)
			return true;
		else
			return false;}


	//function2
	public static int positiveOrNegetive(int x){
		if (x < 0)
			return -99;
		else if (x > 0)
			return 100;
		else
			return 0;}


	//function3
	public static int secondGreat(int a, int b, int c){
		if (a != Math.max(a, Math.max(b, c)) && a != Math.min(a, Math.min(b, c)))
			return a;
		else if (b != Math.max(a, Math.max(b, c)) && b != Math.min(a, Math.min(b, c)))
			return b;
		else 
			return c;}


	//function4
	public static int factorial(int n){
		//A
		int num = 1;
		for (int i = 1 ; i <= n ; i++) {
			num *= i;
		}
		return num;}

	//B
	public static int getingNumber(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive whole number");
		int num = s.nextInt();
		return num;}

	//C
	public static void allFactorias(){
		int num = getingNumber();
		for (int i = 1 ; i <= num ; i++)
			System.out.println(factorial(i));
	}


	//function5
	public static int sumOfDigits(int num){
		boolean bool = true;
		int numOfDigits = 0;
		while (bool) {
			numOfDigits++;
			num /= 10;
			if (num == 0)
				bool = false;}
		return numOfDigits;}
	
	//using the functions...
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//task1
		System.out.println("task1");
		System.out.println("Enter number");
		System.out.println(evenOrOdd((int)s.nextInt()));


		//task2
		System.out.println();
		System.out.println("task2");
		System.out.println("Enter number");
		System.out.println(positiveOrNegetive(s.nextInt()));


		//task3
		System.out.println();
		System.out.println("task3");
		System.out.println("Enter 3 numbers");
		System.out.println(secondGreat(s.nextInt(), s.nextInt(), s.nextInt()));


		//task4
		System.out.println();
		System.out.println("task4...");

		//A
		System.out.println("A");
		System.out.println("Enter number");
		int n = s.nextInt();
		System.out.println(factorial(n));

		//B
		System.out.println("B");
		System.out.println(getingNumber());

		//C
		System.out.println("C");
		allFactorias();


		//task5
		System.out.println();
		System.out.println("task5");
		System.out.println(sumOfDigits(getingNumber()));
	}

}