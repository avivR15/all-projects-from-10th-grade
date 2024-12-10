package firstpackage;

import java.util.Scanner;

public class TheFithProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//משתנים5
		Scanner s = new Scanner(System.in);

		//task1
		System.out.println("task1");
		System.out.println("enter a real number");
		double Num = s.nextDouble();
		if ((Num * 10) % 10 != 0)
			System.out.println(Num + " is Irrational number");
	
		//task2
		//a
		//R1 == 1 && C1 == 4
		//b
		//R2 == 1 && C2 == 3
		//c
		//R1 == 2 && C1 == 3
		//d
		//(R1 + C1) % 2 == 0
		
		//task3
		System.out.println("task3");
		System.out.println("enter a 4 digit number");
		int num = s.nextInt();
		int num0 = num;
		int circleMovement = 0;
		//A
		if (num / 1000 == 0 || num != num % 10000)
			System.out.println("the input is invalid");
		//B
		else {
			System.out.println("Enter the number of times you want to circularly move the number");
			circleMovement = s.nextInt();
			for (int i = 1 ; i <= circleMovement ; i++)
				num = num / 10 + num % 10 * 1000;
			System.out.println("the number \"" + num0 + "\" has changed to " + num);}
		
		/*task4

		 * part1
		1. true
		2. true
		3. true
		4. true
		5. true
		6. true
		7. false
		
		 * part2
		1(example). (num % 3 == 0 || num % 7 == 0) && num % 2 != 0
		2. math > 90 && eng > 90
		3. num > 90 && num < 100
		4. (n1 + n2) > 100 && (n1 + n2) < 200
		5. num % 3 == 0 && num % 4 == 0
		6. num % 3 == 0 && num % 4 != 0
		7. num % 10 == 5 || num / 10 % 10 == 5 || num / 100 % 10 == 5
		8. num / 100 != 0 && num == num % 1000 && num % 2 != 0
		*/
		
		
		//task5
		// יש למקם את שני הכלים אחד על יד השני "true" בשביל שהקוד יחזיר
		
		
		//task6
		System.out.println("task6");
		System.out.println("Enter three different integers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if (a - b == a - c || a - b == c - a || b - a == b - c || b - a == c - b || c - a == c - b || c - a == b - c)
			System.out.println("The numbers can be an invoice series");
		else
			System.out.println("The numbers can't be an invoice series");
		
		
	}

}
