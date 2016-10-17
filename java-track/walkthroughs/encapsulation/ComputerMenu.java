package encapsulation;

import java.util.Scanner;
import java.util.ArrayList;



public class ComputerMenu {
	
	private ArrayList<Computer> computers;
	private Scanner s;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Sentinel structure to look for input when the program reinitiates
		int x = 0;
		ComputerMenu cm = new ComputerMenu();
		do {
			x = cm.startMenu();
			cm.processInput(x);
			
		} while (x != 5);
	}
		
	public ComputerMenu()
	{
		s = Scanner(System.in);
		computers = new ArrayList<Computer>();
		
	}
	
	public int startMenu()
	{
		System.out.println("Welcome to the computer menu!");
		System.out.println("1. Create a computer");
		System.out.println("2. Display a list of available computers");
		System.out.println("3. Change the processor of a computer");
		System.out.println("4. Add memory to a computer");
		System.out.println("5. Exit");
		System.out.println("Please select an option: ");
		
		int selection = s.nextInt();
		
		while(selection < 0  || selection > 5)
		{
			System.out.println("That is an invalid selection. Please try again: ");
			
		}
		
		return selection;
	}
	
	
	
}



