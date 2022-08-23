package keywords_constructors;

class aa1{
	
	public void m1() {
		System.out.println("hii rahul");
	}
	
	public static void main(String []args) {
		aa1 obj=new aa1();
		obj.m1();
	}
}



public class overide_a1 extends aa1 {
	public void m1() {
		System.out.println("hello rahul");
	}

	public static void main(String[] args) {
	 
		overide_a1 obj1=new overide_a1();
		obj1.m1();
		
		
	}

}
