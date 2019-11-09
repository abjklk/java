class Calculation
{
	int z;
	public void addition(int x,int y)
	{
		z=x+y;
		System.out.println("add "+z);
	}
	public void subtraction(int x,int y)
	{
		z=x-y;
		System.out.println("sub "+z);	
	}

}

class Calc extends Calculation{
	void multiplication(int x,int y)
	{
		z=x*y;
		System.out.println("mul "+z);
	}
	public static void main(String[] args) {
		int a=10;
		int b=20;
		Calc demo = new Calc();
		demo.addition(a,b);
		demo.subtraction(a,b);
		demo.multiplication(a,b);

	}
}