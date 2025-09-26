package Activity_StudentAcademia;

public class PersonInfo 
{

	public static void main(String[] args) 
	{
		CollectInfo();
	}
	
	private static void CollectInfo()
	{
		Student personinfo = new Student("John","Doe");
		System.out.println(personinfo.Output());
		Student personinfo2 = new Student("Jane","Doe");
		System.out.println(personinfo2.Output());	
	}
}
