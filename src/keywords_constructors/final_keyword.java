package keywords_constructors;
 class aa{
  final int a=20;// value of variable fixed by using final keyword 
  int b=20;
  
	 final public void m1() {
		 
		 int c=a+b;
		 System.out.println(c);
		 System.out.println("i am m1 of parent class");
	 }
	 
	 public void m1(int b) {//we overload method 
		 
		 System.out.println("i am m1 overloading method of parent class");
	 }
	 
 }


public class final_keyword extends aa {
// we cannot override parent class final declared method means same method name	its show error
       public void m2() {
    	 this.m1();
    	 
    	  
       }

	public static void main(String[] args) {
		
		final_keyword obj=new final_keyword();
          obj.m2();
	     obj.m1(10);
		
		
	}

}
