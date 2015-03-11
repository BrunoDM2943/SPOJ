package spoj.bruno.lifeUniverseEverything;

import java.util.Scanner;

public class Solve {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do{
			num = scan.nextInt();
			if (num != 42) {
				System.out.println(num);
			}
		}while(num != 42);
		scan.close();
	}

}
