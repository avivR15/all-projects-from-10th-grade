package firstpackage;

import java.util.Scanner;

public class triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//general
		
		
		int size = 3;
		int row, length;
		for(row = 1 ; row <= size ; row++) {
			for(length = 1 ; length <= size ; length++)
				System.out.print("*");
			System.out.println();}
		System.out.println("1");
		System.out.println();
		
		
		int TheLength = 10, NumOfRows = 3;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(length = 1 ; length <= TheLength ; length++)
				System.out.print("*");
			System.out.println();}
		System.out.println("2");
		System.out.println();
		
		
		//קובע כמה גדולה תהיה הצורה "NumOfRows" הערה: המשתנה 
		
		NumOfRows = 6;
		int stars, spaces;
		stars = 1;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(int j = 1 ; j <= stars ; j++) {
				System.out.print("*");}
				stars++;
			System.out.println();}
		System.out.println("3");
		System.out.println();
		
		
		NumOfRows = 6;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = NumOfRows - row - 1 ; spaces >= 0 ; spaces--)
				System.out.print(" ");
			for(stars = row ; stars <= row*2 - 1 ; stars++)
				System.out.print("*");
			System.out.println();}
		System.out.println("4");
		System.out.println();
		
		
		NumOfRows = 6;
		stars = NumOfRows;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(int j = 1 ; j <= stars ; j++) {
				System.out.print("*");}
			stars--;
			System.out.println();}
		System.out.println("5");
		System.out.println();
		
		
		NumOfRows = 6;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = row - 1 ; spaces <= row*2 - 3 ; spaces++)
				System.out.print(" ");
			for(stars = NumOfRows - row ; stars >= 0 ; stars--)
				System.out.print("*");
			System.out.println();}
		System.out.println("6");
		System.out.println();
	
		
		NumOfRows = 6;
		int RightForm;
		int a = 0;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = NumOfRows - row - 1 ; spaces >= 0 ; spaces--)
				System.out.print(" ");
			for(stars = row ; stars <= row*2 - 1 ; stars++)
				System.out.print("*");
			for(RightForm = 3 ; RightForm <= stars - a ; RightForm++)
				System.out.print("*");
			a++;
			System.out.println();}
		System.out.println("7");
		System.out.println();
		
		
		NumOfRows = 6;
		stars = 1;
		for (row = 1 ; row <= NumOfRows ; row++) {
			for (spaces = NumOfRows - row - 1 ; spaces >= 0 ; spaces--)
				System.out.print(" ");
			for (stars = row * 2 - 2 ; stars >= 0 ; stars--)
				System.out.print("*");
			System.out.println();}
		System.out.println("7 (2.0#)");
		System.out.println();
		
		
		NumOfRows = 6;
		a = 0;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = row - 5 ; spaces >= 0 - 3 ; spaces--)
				System.out.print(" ");
			for(stars = (NumOfRows - row) * 2 ; stars >= 0 ; stars--)
				System.out.print("*");
			for(RightForm = 1 ; RightForm <= stars ; RightForm++) {
				System.out.print("*");}
			stars--;
			System.out.println();}
		System.out.println("7.5");
		System.out.println();
		
		
		NumOfRows = 5;
		NumOfRows = (NumOfRows + 1) / 2;
		a = 0;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = NumOfRows - row - 1 ; spaces >= 0 ; spaces--)
				System.out.print(" ");
			for(stars = row ; stars <= row*2 - 1 ; stars++)
				System.out.print("*");
			for(RightForm = 3 ; RightForm <= stars - a ; RightForm++)
				System.out.print("*");
			a++;
			System.out.println();}
		NumOfRows--;
		a = 0;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = row - 4 ; spaces >= 0 - 3 ; spaces--)
				System.out.print(" ");
			for(stars = (NumOfRows - row) * 2 ; stars >= 0 ; stars--)
				System.out.print("*");
			for(RightForm = 1 ; RightForm <= stars ; RightForm++) {
				System.out.print("*");}
			stars--;
			System.out.println();}
		System.out.println("8");
		System.out.println();
		
		
		/*
		//?משולש שווה שוקיים
		NumOfRows = 6;
		for(row = 1 ; row <= NumOfRows ; row++) {
			for(spaces = NumOfRows - row - 1 ; spaces >= 0 ; spaces--)
				System.out.print(" ");
			for(stars = row ; stars <= row*2 - 1 ; stars++)
				System.out.print("*");
			for(RightForm = 3 ; RightForm <= stars ; RightForm++)
				System.out.print("*");
			System.out.println();}
			*/
	}

}
