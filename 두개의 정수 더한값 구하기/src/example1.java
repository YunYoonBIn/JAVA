package project;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a ;
		int b ;
		int total;
				
		System.out.println("첫번째 값을 입력하세요.");
		a = input.nextInt();
		
		System.out.println("두번째 값을 입력하세요.");
		b = input.nextInt();
		
		total = a + b ;
		System.out.println("더한 값은" +" "+ total );
		
	}

}
