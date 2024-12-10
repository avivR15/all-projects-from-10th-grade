package firstpackage;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//the char
		Scanner s = new Scanner(System.in);
		
		//task1
		System.out.println("task1");
		System.out.println("Enter a letter");
	  	char tav = s.next().charAt(0);
		System.out.println("The asci code of \"" + tav + "\" is: " + (int)(tav));
	
		//task2
		System.out.println("task2");
		System.out.println("Enter your first name");
		char x = s.next().charAt(0);
		System.out.println("Enter your last name");
		char y = s.next().charAt(0);
		System.out.println("The acronyms of your name is: " + x + "\"" + y);
		
		//task3
		System.out.println("task3");
		System.out.println("Enter a two positive numbers betwin 0 and 127");
		int n = s.nextInt();
		int m = s.nextInt();
		System.out.println("the assci letter for the number \"" + n + "\" is: " + (char)(n) + " and the assci letter for the number \"" + m + "\" is: " + (char)(m));
		
		//task4
		//A
		//the output: "198"
		
		//B
		//the output: "e E"
				
		//task5
		System.out.println("task5");
		System.out.println("Enter a number or letter and a number betwin 0 and 127");
		char charTav = s.next().charAt(0);
		int num = s.nextInt();
		
		if((int)charTav > num)
			System.out.println(charTav);
		else
			System.out.println((char)num);
		
	}

}
