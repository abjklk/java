class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}

class Emp extends Person{
	float sal;
	Emp(int id,String name,float sal)
	{
		super(id,name);
		this.sal=sal;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+sal);
	}

}

class Student{
	//todo

}

class TestEmp{
	public static void main(String[] args) {
		Emp e1 = new Emp(1,"ankit",2500);
		e1.display(); 
	}
}
