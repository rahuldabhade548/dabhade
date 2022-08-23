package keywords_constructors;

public class a1_key {
	a1_key (){
		this(20);
		System.out.println("i am not parametrasied");
	}
	
	a1_key (int a){
		
		System.out.println("i am parametrazed "+a);
	}
	
	public static void main(String[] args) {
		
		a1_key obj =new a1_key();// call the non parametrised constructor
		

	}

}
