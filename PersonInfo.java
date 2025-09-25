package Activity_StudentAcademia;

public class PersonInfo {

	public static void main(String[] args) 
	{
		CollectInfo();
	}
	
	private static void CollectInfo()
	{
		Student personinfo = new Student("John","Doe","Jane","Doe",100,95);
		System.out.println("Name: " + personinfo.getName());
		System.out.println("Grade: " + personinfo.getGradelvl1());
		System.out.println(personinfo.getGPA());
		System.out.println("Name: " + personinfo.getName2());
		System.out.println("Grade: " + personinfo.getGradelvl2());
		System.out.println(personinfo.getGPA());

		
		
	}
}
