abstract class x{
	abstract void hello();
}

class b extends x{
	void hello(){
		System.out.println("he");
	}
}
class a {
	public static void main(String[] args) {
		// b B = new b();
		// B.hello();
		String[] a = new String[5];
		for(int i=0;i<5;i++){
			a[i]="HE"+i;
			System.out.println(a[i]);
		}
	}
}