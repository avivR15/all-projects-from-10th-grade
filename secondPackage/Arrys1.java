package secondPackage;

import java.util.Scanner;

public class Arrys1 {

	//function for task5
    public static void fillArray(int[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = s.nextInt();
        arr[0] = num;
        for (int i = 1; i < arr.length; i++) 
            arr[i] = arr[i - 1] * 2;}
    //bonus
	public static void sortArray(int[] arr) {
		int len = arr.length - 1;
		for (int i = 0 ; i < len ; i++) {
			for (int j = 0 ; j < len - i ; j++) {
				if (arr[j] > arr[j + 1]) {
					int swip = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swip;}}}
		for (int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		}
	
            
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		
		//task1
		System.out.println("task1"); 
		//A
        int[] arr = new int[10];
        System.out.println("Enter the numbers for the array");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = s.nextInt();
        System.out.print("the numbers in the even palaces of the array is: ");
        for (int i = 0 ; i < arr.length/2 ; i++)
        	System.out.print(arr[i*2] + " ");
		System.out.println();

		//B
        System.out.println("Enter the numbers for the array");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = s.nextInt();
        System.out.print("the numbers in the array from the end to the begining is: ");
        for (int i = arr.length-1 ; i >= 0 ; i--)
        	System.out.print(arr[i] + " ");
		System.out.println();

		//C
        System.out.println("Enter the numbers for the array");
        for (int i = 0 ; i < arr.length ; i++)
            arr[i] = s.nextInt();
        System.out.print("the numbers in the array from the half to the begining and from the half to the end is: ");
        for (int i = arr.length/2-1 ; i >= 0 ; i--)
        	System.out.print(arr[i] + " ");
        for (int i = arr.length/2-1 ; i <= arr.length-1 ; i++) 
        	System.out.print(arr[i] + " ");
		System.out.println();


		//task2
		System.out.println("task2");
		int[] arr2 = new int[10];
		int sum = 0;
        System.out.println("Enter the numbers for the array");
		for (int i = 0 ; i <= arr2.length-1 ; i++)
            arr2[i] = s.nextInt();
        for (int i = 0 ; i <= arr2.length-1 ; i++)
        	sum += arr2[i];
        System.out.println("the avarage is: " + (double)sum/arr2.length);
        System.out.println();


		//task3
		System.out.println("task3");
		int[] arr3 = new int[10];
        System.out.println("Enter the numbers for the array");
		for (int i = 0 ; i <= arr3.length-1 ; i++)
            arr3[i] = s.nextInt();
		int max = arr3[0];
        for (int i = 1; i <= arr3.length-1; i++)
            if (arr3[i] > max)
                max = arr3[i];
        System.out.println("the biggest number in the array is: " + max);
		System.out.println();
		

		//task4
		System.out.println("task4");
		
		//A
		System.out.println("Enter the size of the array");
		int size = s.nextInt();
		int[] arr4 = new int[size];
		System.out.println("Enter the numbers for the array");
		for (int i = 0; i < size; i++)
			arr4[i] = s.nextInt();
		System.out.print("the numbers in the array is: ");
		for (int i = 0 ; i < size ; i++)
			System.out.print(arr4[i] + " ");
		System.out.println();
		
		//B
		sum = 0;
		for (int i = 0 ; i < size ; i++)
			sum += arr4[i];
		System.out.println("the sum of all the numbers inside the array is: " + sum);
		
		//C
		double Average = (double)sum/(double)size;
		System.out.println("the average of all the numbers inside the array is: " + Average);
		
		//D
		max = arr4[0];
		for (int i = 0 ; i < size ; i++)
            if (arr4[i] > max)
                max = arr4[i];
        System.out.println("the biggest number in the array is: " + max);
        
        //E
		max = arr4[0];
		int place = 1;
		for (int i = 0 ; i < size ; i++)
            if (arr4[i] > max)
                place = i+1;
        System.out.println("the place of the biggest number in the array is: " + place);
        
        //F
        int min = arr4[0];
		for (int i = 0 ; i < size ; i++)
            if (arr4[i] < min)
                min = arr4[i];
        System.out.println("the smallest number in the array is: " + min);
        
        //G
        System.out.println("Enter a parmeter (number):");
        int parameter = s.nextInt();
        int counter = 0;
        for (int i = 0 ; i < size ; i++)
            if (arr4[i] == parameter)
                counter++;
        System.out.println("the much of times that the parameter " + parameter + " was in the array is: " + counter);
		
        
		//task5
		System.out.println("task5");
		int[] arr5 = new int[12];
        fillArray(arr5);
        System.out.print("the numbers in the array is: ");
		for (int i = 0 ; i < arr5.length ; i++)
			System.out.print(arr5[i] + " ");
		System.out.println();
		 


		//task6
		//0, 0, 1, 0, 2, 0 , 3, 0, 4, 0


		//task7
		//תיהיה שגיעת זמן ריצה כי המערך רוצה לקבל ספרה שעדיין לא קיימת. 
		//אבל בגדול המספר הראשון איהיה שווה למספר העשירי, המספר השני איהיה שווה למספר התשיעי
		//המספר השלישי איהיה שווה למספר השמיני, המספר הרביעי איהיה שווה למספר השביעי, והמספר החמישי איהיה שווה למספר השישי


		//task8
		//A 
		// .כל המספרים במערך איהיו שווים לספרה הראשונה של המערך
		//B
		/*int lastDigit = 0;
		for (int i = arr.length - 1 ; i >= 0 ; i--)
			if (i == arr.length - 1)
				lastDigit = arr[arr.length - 1];
			else
				arr[i + 1] = arr[i];
		arr[0] = lastDigit;*/
		
		//task9
		//A
		//מטרת הלולאה היא לעבור על כל המערך ולהדפיס את הערכים שמתחלקים ב5
		
		//B
		//מטרת הלולאה היא לעבור על כל המערך ולהדפיס את הערכים שהמיקום שלהם במערך מתחלק ב5
		
		//C
		/*for (i = 0 ; i < arr.length ; i+=5)
		System.out.println(arr[i]);*/
		
		
		//bonus-task
		System.out.println("bonus");
		int[] arrBonus = new int[10];
		System.out.println("Enter the numbers for the array");
        for (int i = 0 ; i < arrBonus.length ; i++)
            arrBonus[i] = s.nextInt();
		sortArray(arrBonus);
		
	}

}
