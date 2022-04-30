
public class Person {
	public int Age;
	public static int Counter = 0;
		// Minden letrehozott Person darabszama
	
	Person(int age)
	{
		this.Age = age;
		Counter++;
	}
	
	void show()
	{
		System.out.println(toString());
	}
	
	public static void staticShow()
	{
		System.out.println("Counter="+Counter);
	}
	
	@Override
	public String toString()
	{
		return "Person, Age="+this.Age+", Counter="+Counter;
	}
	
	public Person clone()
	{
		Person clone = new Person(this.Age);
		//clone.Age = this.Age;
		return clone;
	}
}
