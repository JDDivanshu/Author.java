package com.design.account;

import java.util.Scanner;

public class AccontPin {

	public static void main(String[] args, int PWD, int i) {
		final int PIN= 03061;
		int pwd= 55082;
		//you have to design the code such that the user has only three tries to guess the correct pin of the accont.
        //you set the pin as a constant with a final attribute.
		//when correct display "correct welcome back ." when incorrect display "icorrect try again."
		//when ran out of tries display "sorry but you have been locked out."
		for(i=0; i<3; i++)
		{
		System.out.println("please enter pin");
		//please enter pin:
		Scanner s=new Scanner(System.in);
		int Pin = s.nextInt();
		if(PWD == PIN)
		{
		 System.out.println("Correct  Welcome back");
		}
		else
		{
		System.out.println("incorrect try again");
		//incorrect try again:
		//please enter pin:
	    //23558
		//output
		System.out.println("incorrect try again");
		//incorrct try again.
		//please enter pin 
		//114477
		//please enter pin:
	    //000000
		//output
		System.out.println("sorry but you have been locked out");
		//sorry but you have been locked out:
		}
		}
	
		}
}
