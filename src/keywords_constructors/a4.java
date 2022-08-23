package keywords_constructors;



public class a4 {
	
 	String name="sureshrevgao";

 String surname="golde";
 String aa="SURESH";
	

	 
	public static void main(String[] args) {
		a4 z=new a4();
		
		int a=z.name.length();
		int b=z.surname.length();
		System.out.println(a);
	    System.out.println(b);
	    System.out.println(z.name.equals(z.surname));
	    
	    String [] j=z.name.split("h");
	     String d=j[0];
	     String d1=j[1];
	   System.out.println(" "+z.name);
       System.out.println(z.name.trim());
		
	}
}

