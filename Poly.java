import java.util.*;

class Superclass
{
	int a=10;
	Superclass(){
		System.out.println("From super");
		System.out.println(a);	
	}
}

class Base extends Superclass
{
	int b=69;
	Base(){
		System.out.println("From Base");
		System.out.println(a);
		System.out.println(b);
	}
}

class Poly
{
	public static void main(String[] args) {
		Base b = new Base();
	}
}