package keywords_constructors;

 class a1{
	 int a;
	 public void m1() {
		 System.out.println("i am parent class method & this class variable value is "+a);
	 }
	
 }




public class super_key extends a1{
	
	public void m2(int a) {
		
		super.a=a;
	}
	
	public static void main(String[] args) {
		
	super_key obj =new super_key ();
	obj.m2(20);
	System.out.println(obj.a);
	obj.m1();
	
	
		

	}
// here we give the value of parent class variable in child class by using super keyword
}
