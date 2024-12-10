package secondPackage;

import java.util.Random;
import java.util.Scanner;

public class Arrys2 {

	//task1
	public static void fiveRepiter(int arr[]) {
		for (int i = 0 ; i < arr.length ; i++)
			arr[i] = 5;
	}

	
	//task2
	public static void growing(int arr[]) {
		for (int i = 0 ; i < arr.length ; i++)
			arr[i] = i + 1;
	}


	//task3
	public static int sumArr(int arr[]) {
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++)
			sum += arr[i];
		return sum;
	}

	//task6 - A
	public static int range(int begin, int end) {

		Random random = new Random();
		int rand = random.nextInt(Math.abs(begin - end) + 1) + Math.min(end, begin);
		return rand;
	}

	//task6 - B
	public static void arrOfRange(int arr[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers which will be the range of numbers that can pasiblly apear in the array: ");
		int begin = s.nextInt();
		int end = s.nextInt();
		for (int i = 0 ; i < arr.length ; i++)
			arr[i] = range(begin, end);
	}


	//task7
	public static void printArr(char arr[]) {
		for (int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	//task8
	public static void printArrOpsite(char arr[]) {
		for (int i = arr.length - 1 ; i >= 0 ; i--)
			System.out.println(arr[i]);
		System.out.println();
	}

	//task9
	public static double ArrayMin(double arr[]) {
		double min = arr[0];
		for (int i = 0 ; i < arr.length ; i++)
			if (arr[i] < min)
				min = arr[i];
		return min;
	}

	//task10
	public static int ArrayMinIndox(double arr[]) {
		double min = arr[0];
		int minIndox = 1;
		for (int i = 0 ; i < arr.length ; i++)
			if (arr[i] < min) {
				min = arr[i];
				minIndox = i+1;}
		return minIndox;
	}

	//task11
	public static int MachOfTimesArray(int arr[], int num) {
		int counter = 0;
		for (int i = 0 ; i < arr.length ; i++)
			if (arr[i] == num)
				counter++;
		return counter;
	}

	//task12
	public static double averageodds(int arr[]) {
		double counter = 0;
		double sum = 0;
		for (int i = 0 ; i < arr.length ; i++)
			if (arr[i] % 2 == 0) {
				counter++;
				sum += (double)arr[i];}
		return sum/counter;
	}

	//task13
	public static char maxChar(char arr[]) {
		int most = 0, times = 0, counter;
		char letter = arr[0];
		for (int i = 0 ; i < arr.length ; i++) {
			counter = 0;
			for (int j = 0 ; j < arr.length ; j++) {
				if (arr[i] == arr[j])
					counter++;
				if (counter > times) {
					letter = arr[i];
					times = counter;
				}}}
		return letter;
	}



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr;
		char[] arrCh;
		double[] arrDoub;

		
	    //cheking-task1
		System.out.println("task1");
		arr = new int[10];
	    System.out.println("build an array: ");
		for (int i = 0 ; i < arr.length ; i++)
        	arr[i] = s.nextInt();
		System.out.println();

		fiveRepiter(arr);
		System.out.println("the array changed to: ");
		for (int i = 0 ; i < arr.length ; i++)
			System.out.println(arr[i]);
		System.out.println();


		//cheking-task2
		System.out.println("task2");
		System.out.print("Enter the length of the array: ");
		int m = s.nextInt();
		arr = new int[m];
	    System.out.println("Build an array: ");
		for (int i = 0 ; i < m ; i++)
        	arr[i] = s.nextInt();

		growing(arr);
		System.out.print("the array changed to: ");
		for (int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println();


	    //cheking-task3
		System.out.println("task3");
		arr = new int[10];
	    System.out.println("build an array: ");
		for (int i = 0 ; i < arr.length ; i++)
        	arr[i] = s.nextInt();
		System.out.println("the sum of all the numbers in the array is: " + sumArr(arr));
		System.out.println();


		//task4
		//A
		// google docs...
		//B
		// 10, 99, 11, 98 ,20, 50


		//task5
		//A
		// google docs...
		//B
		// 0, 0, 1, 0, 0


		//cheking-task6
		System.out.println("task6");
		arr = new int[10];
		arrOfRange(arr);
		for (int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		System.out.println();


		//cheking-task7
		System.out.println("task7");
		arrCh = new char[10];
		System.out.println("build an array of chars: ");
		for (int i = 0 ; i < arrCh.length ; i++)
			arrCh[i] = s.next().charAt(0);
		System.out.println();
		printArr(arrCh);
		System.out.println();


		//cheking-task8
		System.out.println("task8");
		arrCh = new char[10];
		System.out.println("build an array of chars: ");
		for (int i = 0 ; i < arrCh.length ; i++)
			arrCh[i] = s.next().charAt(0);
		
		System.out.println("the array changed to: ");
		printArrOpsite(arrCh);


		//cheking-task9
		System.out.println("task9");
		arrDoub = new double[10];
		System.out.println("build an array of actual numbers: ");
		for (int i = 0 ; i < arrDoub.length ; i++)
			arrDoub[i] = s.nextDouble();
		System.out.print("The smallest number in the array is: " + ArrayMin(arrDoub));
		System.out.println();


		//cheking-task10
		System.out.println("task10");
		arrDoub = new double[10];
		System.out.println("build an array of actual numbers: ");
		for (int i = 0 ; i < arrDoub.length ; i++)
			arrDoub[i] = s.nextDouble();
		System.out.print("The place of the smallest number in the array is: " + ArrayMinIndox(arrDoub));
		System.out.println();
		 
		 
		//cheking-task11
		System.out.println("task11");
		arr = new int[10];
		System.out.print("Insert the parameter: ");
		int num = s.nextInt();
		System.out.println("build an array: ");
		for (int i = 0 ; i < arr.length ; i++)
			arr[i] = s.nextInt();
		System.out.println();
		System.out.print("the much of times that the parameter was apeard in the array: " + MachOfTimesArray(arr, num));
		System.out.println();


		//cheking-task12
		System.out.println("task12");
		arr = new int[10];
		System.out.println("build an array: ");
		for (int i = 0 ; i < arr.length ; i++)
			arr[i] = s.nextInt();
		System.out.println(averageodds(arr));
		
		
		//cheking-task13
		System.out.println("task13");
		arrCh = new char[10];
		System.out.println("build an array of chars: ");
		for (int i = 0 ; i < arrCh.length ; i++)
			arrCh[i] = s.next().charAt(0);
		System.out.println(maxChar(arrCh) + " was apaerd in the array the most of the times");

	}

}
