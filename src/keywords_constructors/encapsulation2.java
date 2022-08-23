package keywords_constructors;

public class encapsulation2 {
	private int a;
	
	
	public void seta (int a) {
		
		this.a=a;
	}
	  
	public int geta () {
		return a;
	}
	  

	public static void main(String[] args) {
		encapsulation2 obj =new encapsulation2 ();
		obj.seta(10);
		System.out.println(obj.geta());
		obj.seta(20);
	
		System.out.println(obj.geta());
		
		
		
	}

}
