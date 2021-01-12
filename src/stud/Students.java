package stud;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("------------Student Registration System------------");
		
		do {
			Students s=new Students();
			System.out.println("1: Add Records");
			System.out.println("2: Guardian Records");
			System.out.println("3: Course Details ");
			System.out.println("4: Exit");
			System.out.println("Enter Your Choice  :");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("You have Entered Invalid Number");
			}
			System.out.println("Do You Want To Contine Press 1");
		}while(sc.nextInt()==1);

	}
	
	Scanner scan=new Scanner(System.in);
	
	public void add() {
		System.out.println("Student details: ");
		System.out.println("Enter student's name");
		String name=scan.next();
		
		System.out.println("Enter student ID");
		int id=scan.nextInt();
		
		System.out.println("Enter student's Email");
		String email=scan.next();
		
		System.out.println("Student Address ");
		String addr=scan.nextLine();
		
		System.out.println("Enter birth of Date");
		String date=scan.nextLine();
		
		System.out.println("Enter student's contact no");
		int contact=scan.nextInt();
		
	}
	
	public void Parent() {
		System.out.println("Student's Parent details: ");
		System.out.println("Enter Parent's name");
		String pname=scan.nextLine();
		
		System.out.println("Enter  Parent's contact no");
		int pcontact=scan.nextInt();
		
		
		
	}
	
	public void course() {
		System.out.println("Enter the Course from Following");
		System.out.println("Computer Technology ");
		System.out.println("Infromation Technology ");
		System.out.println("Electrical Engineering");
		System.out.println("Mechanical Engineering");
		String s=scan.nextLine();
		System.out.println(" You have Selected : "+s);
		
	}
	
	public void exit() {
		System.out.println("Thanks for visiting our System ");
	}
	
	

}
