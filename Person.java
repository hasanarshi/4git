import java.util.Scanner;

public class Person 
{
	String name;
	int age;
	
	void showPersonDetails()
	{
		System.out.println("name is "+name+" and age is "+age+" years");
	}
		
	public static void main(String[] args) 
	{
		// object initialized using no-arg-cnst
		Person p1 = new Person();
		p1.showPersonDetails();

		// object initialized using param-cnst
		Person p2 = new Person("naval", 21);
		p2.showPersonDetails();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter person name: ");
		String pname = sc.nextLine();
		System.out.print("Enter person age: ");
		int page = sc.nextInt();
		
		// object initialized using param-cnst
		Person p3 = new Person(pname, page);
		p3.showPersonDetails();
	}
	
	// limitation is : multiple objects will have same data
	Person() // user defined no-arg-cnst
	{
		System.out.println("no arg cnst called");
		name = "aman";
		age = 20;
	}
	
	Person(String person_name, int person_age)
	{
		// store the value of local variables inside non-static-vars
		name = person_name;
		age = person_age;
		System.out.println("param cnst called");
	}
}