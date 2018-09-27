import java.util.Scanner;

public class ProblemSet2 {
  static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		in.close();
	}
	
	public void sayHello() {
		System.out.println("What is your full name?");
		String fullName = in.nextLine(); 
		System.out.println("Hello, " + fullName + "!");
		System.out.println(" ");
	}
	
	public void gradeMe() {
		System.out.println("What is your first homework grade?");
		int homework1 = in.nextInt(); 
		
		System.out.println("What is your second homework grade?");
		int homework2 = in.nextInt();
		
		System.out.println("What is your third homework grade?");
		int homework3 = in.nextInt();
		
		double average_homework = ((homework1 + homework2 + homework3) / 3);
		
		System.out.println("What is your first quiz score?");
		int quiz1 = in.nextInt(); 
		
		System.out.println("What is your second quiz score?");
		int quiz2 = in.nextInt();
		
		System.out.println("What is your third quiz score?");
		int quiz3 = in.nextInt();
		
		double average_quiz = ((quiz1 + quiz2 + quiz3) / 3); 
		
		System.out.println("What is your first test score?"); 
		int test1 = in.nextInt(); 
		
		System.out.println("What is your second test score?"); 
		int test2 = in.nextInt(); 
		
		System.out.println("What is your third test score?"); 
		int test3 = in.nextInt(); 
		
		double average_test = ((test1 + test2 + test3) / 3); 
		
		double final_grade = ((average_homework * .15) + (average_quiz * .3) + (average_test * .55));
		System.out.printf("Your final grade is %.2f!\n", final_grade);
		System.out.println(" ");
	}
	
	public void groupUs() {
		System.out.println("How many students will be attending?");
		double students = in.nextDouble(); 
		System.out.println("How many teachers will be attending?");
		double teachers = in.nextDouble(); 
		in.nextLine(); 
		
		int number_of_buses = (int) Math.ceil((students + teachers) / 46); 
		System.out.println("You need " + number_of_buses + " buses for the trip!");
		System.out.println(" "); 
	}
	
	public void info() {
		System.out.println("What is your first name?"); 
		String first_name = in.nextLine(); 
		System.out.println("What is your last name?");
		String last_name = in.nextLine(); 
		System.out.println("What grade are you in?");
		String grade_level = in.nextLine(); 
		System.out.println("How old are you?");
		String age = in.nextLine(); 
		System.out.println("What is your hometown?");
		String hometown = in.nextLine(); 
		
		System.out.println("NAME     : " + first_name + " " + last_name);
		System.out.println("GRADE    : " + grade_level);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
		System.out.println(" ");
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		char firstName = in.nextLine().charAt(0); 
		System.out.print("Please enter your middle name: ");
		char middleName = in.nextLine().charAt(0);
		System.out.print("Please enter your last name: ");
		char lastName = in.nextLine().charAt(0);
		
		System.out.println("Your initials are " + firstName + middleName + lastName + "!");
		in.close();
	}
}