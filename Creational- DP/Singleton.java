import java.util.Scanner;

class Singleton {

	private static Singleton instance;
	public int value, value2;
	private static Scanner scanner;
	
	public Singleton()
	{
		
	}
	
	public static Singleton isThereInstance()
	{

		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	
	public void setValue1(int value)
	{
		this.value = value;
	}
	
	public void setValue2(int value2)
	{
		this.value2 = value2;
	}
	
	public int getValue1()
	{
		return value;
	}
	
	public int getValue2()
	{
		return value2;
	}
	
	
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		Singleton.isThereInstance().setValue1(scanner.nextInt());
		Singleton.isThereInstance().setValue2(scanner.nextInt());
		
		System.out.println("Sum of two numbers is: "+ (Singleton.isThereInstance().getValue1() + Singleton.isThereInstance().getValue2()));
	}
}

