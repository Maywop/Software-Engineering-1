package ggT2;

import java.util.Scanner;

public class ggT {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("ggT ist:" + ggt(a,b));
		
	}

	static int ggt(int a, int b) {
		if (a == 0 || b == 0)
			return 0;
		if (a==b)
			return a;
		if(a > b)
			return ggt(a-b,b);
		else
			return ggt(a,b-a);
	}
}
