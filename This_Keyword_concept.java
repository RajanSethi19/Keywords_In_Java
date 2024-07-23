package Some_Keywords_In_Java;

public class This_Keyword_concept {

	String name;
	int age;
	double salary = 77777;

	void employee_Status(int age, String name, double salary) {
		System.out.println("I am in non static method");

		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println(salary);
		System.out.println(age);
		System.out.println(name);

	}

	public static void main(String[] args) {
		This_Keyword_concept t = new This_Keyword_concept();
		t.employee_Status(10, "Rajan", 50000);
		System.out.println(t.salary);
		// global variable value is also changed bcz local variable
		// has assigned its value in global by using this keyword

	}

}
