package Activity_StudentAcademia;

import java.util.Scanner;

public class Student 
{
	Scanner input = new Scanner(System.in);
	
	private String firstname;
	private String lastname;
	private double num1;
	private double num2;
	private double GPA;
	
	public Student(String fname, String lname) 
	{
		this.firstname = fname;
		this.lastname = lname;
	}
	
	public String getName() 
	{
		String nameOne;
		nameOne = firstname + " " + lastname;
		return nameOne;
	}
	
	public int getGradelvl()
	{
		System.out.print("Enter current grade level for " + getName() + ": ");
		int gradelvl = input.nextInt();
		return gradelvl;
	}
	
	public String getGPA()
	{
		System.out.print("Enter GPA: ");
		num1 = input.nextInt();
		
		String x = CalcGPA(num1);
		
		return x;
	}
	
	
	
	public String updateGPA()
	{
		System.out.print("Enter new GPA: ");
		num2 = input.nextInt();
		
		double NewNum = num1 + num2;
		double AveNum = NewNum / 2;
		
		String x = CalcGPA(AveNum);
		
		return x;	
	}
	
	public String CalcGPA(double Entnum)
	{
		double ChangeGPA = Entnum / 100;
		GPA = ChangeGPA * 4;
		String ShowGPA = "GPA: " +  Entnum + "\n" + "4.0 scale GPA: " + GPA;
		
		return ShowGPA;
	}
	
	public String isHonorRoll()
	{
		if(GPA >= 3.5)
		{
			String DeclareHonor = getName() + " is in honor roll.";
			return DeclareHonor;
		}
		else
		{
			String DeclareHonor = getName() + " is not in honor roll.";
			return DeclareHonor;
		}
	}
	
	public String promote()
	{
		if(num1 >= 65)
		{
			return "grade level increased";
		}
		else
		{
			return "grade failed";
		}
	}
	
	
	
	public String Output()
	{
		String s = "";
		s += "Name: " + getName() + "\n" + "Grade: " + getGradelvl() + "\n" + getGPA() + "\n" + isHonorRoll() + "\n" + promote() + "\n" + "|UPDATED|" + "\n" + updateGPA();
		return s;	
	}
	
}
