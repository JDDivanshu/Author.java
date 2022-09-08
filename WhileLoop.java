package WhileLoop.com.bll;
import java.util.Scanner;

public class firstandsecondnum{

	private static final Scanner sc = null;

	public static void main(String[] args, String sumE) {
		int firstNum,secondNum;
		Scanner Keyboard=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		firstNum= Keyboard.nextInt();
		System.out.println("Enter another integer larger than the first one: ");
		secondNum= Keyboard.nextInt();
		int even=0;
		int SumE = 0;
		int odd = 0;
		int sum0 = 0;
		int count =1;
		  /*Let:
		firstNum =3
		secondNum=5 */ 
	//first we do the check in the while loop
		while(firstNum<= secondNum) {
			if (secondNum %2  ==0)
			SumE =SumE +secondNum;
			else
			sum0 =sum0 + secondNum;
			
		}
		   System.out.println("Even numbers: " + sumE);
		   System.out.println("Sum of even numbers = ");
		   System.out.println("Odd numbers: " + sum0);
		   System.out.println("Sum of odd numbers = ");
		   
		   sc.close();
			
		}
