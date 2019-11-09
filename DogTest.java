class Animal{
	String color="white";
	void eat()
	{
		System.out.println("nom nom");
	}
}

class Dog extends Animal{
	String color ="red";
	void bark()
	{
		System.out.println("bow bow "+super.color);
	}

}

class Puppy extends Dog{
	void weep()
	{
		System.out.println("weep weep");
	}
}

class DogTest{
	public static void main(String[] args) {
		Puppy pup = new Puppy();
		pup.weep();
		pup.bark();
		pup.bark();
		pup.eat();
	}
} 