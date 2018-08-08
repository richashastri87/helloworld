package InterPack;

public class compute extends deriveAbsEx
{

	@Override
	int add(int a, int b) 
	{
		return (a+b);
		
	}

	@Override
	int sub(int a, int b) 
	{
	
		return (a-b);
	}

	@Override
	void tax(int a)
	{
		System.out.println("Tax would be " + a);
		
	}

}
