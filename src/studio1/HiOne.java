package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		System.out.print("Hi, "+ name + ". How are you?");
		

	}

}
