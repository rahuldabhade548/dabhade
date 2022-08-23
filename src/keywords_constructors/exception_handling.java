package keywords_constructors;

public class exception_handling {

	public static void main(String[] args) {
	try	{
		 int a=10;
		int b=20;
		
		int c=a+b;
		System.out.println("addition is  "+c);
	      a=a/0;//here this condition shows error when not used try,catch,finally methods
	      
	      System.out.println("ok");
	}
	
	catch(Exception d) {
		System.out.println(d);
	}
	
	finally {
		System.out.println("to close the all open files");
	}
		
	

		
		
		
		
		
	
		
		       
	

}}
