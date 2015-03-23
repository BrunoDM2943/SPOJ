import java.util.Scanner;


public class Solve {
	
	
	public static int getReversedNumber(Integer i){
		int reversed = 0;	
		char[] array = i.toString().toCharArray();
		
		char[] revesedArray = new char[array.length];
		int j=0;
		for(i=array.length-1;i>=0; i--){
			revesedArray[j] = array[i];
			j++;
		}
		reversed = Integer.parseInt(String.valueOf(revesedArray));
		
		return reversed;
	}

	
	public static void main(String[] args) {
		int testCases, n, m, res;
		Scanner scan = new Scanner(System.in);
		testCases = scan.nextInt();
		do{
			n = scan.nextInt();
			m = scan.nextInt();
			
			n = getReversedNumber(n);
			m = getReversedNumber(m);
			System.out.println(getReversedNumber(n+m));
			
			testCases--;
		}while(testCases!=0);
		
		scan.close();
	}

}
