package Activity_StudentAcademia;

import java.util.Scanner;

public class Student 
{
	Scanner input = new Scanner(System.in);
	
	private String firstStudent;
	private String firstlast;
	private String secondStudent;
	private String secondlast;
	private int initialGradeJohn;
	private int initialGradeSunny;
	
	
	
	public Student(String student1, String lastname1, String student2, String lastname2, int grade, int grade2) 
	{
		this.firstStudent = student1;
		this.firstlast = lastname1;
		this.secondStudent = student2;
		this.secondlast = lastname2;
		this.initialGradeJohn = grade;
		this.initialGradeSunny = grade2;
	}
	
	public String getName() 
	{
		String nameOne;
		nameOne = firstStudent + " " + firstlast;
		return nameOne;
	}
	
	public String getName2() 
	{
		String nameTwo;
		nameTwo = secondStudent + " " + secondlast;
		return nameTwo;
	}
	
	public int getGradelvl1()
	{
		System.out.print("Enter current grade level for " + getName() + ": ");
		int gradelvl1 = input.nextInt();
		
		return gradelvl1;
	}
	
	public int getGradelvl2()
	{
		System.out.print("Enter current grade level for " + getName2() + ": ");
		int gradelvl2 = input.nextInt();
		
		return gradelvl2;
	}
	
	public String getGPA()
	{
		System.out.print("Enter math grade: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter history grade: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter science grade: ");
		int num3 = input.nextInt();
		
		System.out.print("Enter english grade: ");
		int num4 = input.nextInt();
		
		int sum = num1 + num2 + num3 + num4;
		double GPA = sum / 4;
		double ChangeGPA = GPA / 100;
		double newGPA = ChangeGPA * 4;
		
		String DisplayGPA = "GPA: " + GPA + "\n" + "GPA 4.0 scale: " + newGPA; 
		
		return DisplayGPA;
	}


	
}
