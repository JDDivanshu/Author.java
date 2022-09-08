package com.count.num;
    //java code to count number of
	//digits in an integer

public class CountDigit {
	
	static int countDigit (long n) {
		int count =0;
		while (n!=0) {
			n=n/10;
			count++;
			
		}
		return count;
		
		}
	/* Driver code */
	public static void main(String[] args) {
		long n = 345697665;
		System.out.println("Number of digits :" + countDigit(n));
		
		

	}

}
