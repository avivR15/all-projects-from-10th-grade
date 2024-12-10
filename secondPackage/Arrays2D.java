package secondPackage;

import java.util.Random;
import java.util.Scanner;

public class Arrays2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		int arr[][] = new int[30][3];
		
		//task1
		System.out.println("task1");
		int counter = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j]= random.nextInt(91)+10;
				counter++;
				}
		//A
		System.out.println("A");
		for(int i = 0; i < arr.length; i++)
			System.out.println("the average grade of studunt number " + (i+1) + " is " + (double)(arr[i][0]+arr[i][1]+arr[i][2])/arr[i].length);
		
		//B
		int average[] = new int[30];
		System.out.println("B");
		for(int i = 0; i < arr.length; i++)
			
/*			
		int double max = arr[0][0];
		System.out.println(max);
	 	for(int i = 0; i < arr.length; i++)
			max = ((double)(arr[i][0]+arr[i][1]+arr[i][2])/arr[i].length)
	*/	
		
		
		//checkingArrey
		for(int i1 = 0; i1 < arr[0].length; i1++) {
			for(int j = 0; j < arr.length; j++)
				System.out.print(arr[j][i1] + " ");
			System.out.println();
		}
		System.out.println();
		
		
		//task2
		System.out.println("task2");
		
		
		//task3
		System.out.println("task3");
		
		
		//task4
		System.out.println("task4");
		
		
		//task5
		System.out.println("task5");
		
		
		//task6
		System.out.println("task6");
		
		
		//task7
		System.out.println("task7");
		
		
		//task8
		System.out.println("task8");
		
		
		//task9
		System.out.println("task9");
		
		
		//task10
		System.out.println("task10");
		

		//task11
		System.out.println("task11");
		
		
		//task12
		System.out.println("task12");
		
		
		//task13
		System.out.println("task13");
		
		
		//task14
		System.out.println("task14");
		
		
		//task15
		System.out.println("task15");
		
		
		//task16
		System.out.println("task16");
		
	}
	
}