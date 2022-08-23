package keywords_constructors;
  class keyword{
	public void m1() {
		System.out.println("i am method m1 in first class");
	}
	
  }
 

public class keyword1 extends keyword {
	
   public void m2() {
	   super.m1();
	   System.out.println("i am method m2 in class2 ");
   }
	public static void main(String[] args) {
		keyword1 obj=new keyword1();
		obj.m2();
	}

}
