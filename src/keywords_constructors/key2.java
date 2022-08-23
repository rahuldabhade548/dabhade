package keywords_constructors;
class key1{
	
	key1(){
		System.out.println("i am key1 constructor ");
	}
	
	
}


public class key2 extends key1 {

	key2(){
		

		System.out.println("i am key2 constructor");
	}
	public static void main(String[] args) {
		key2 obj =new key2();
		
		
		
	}

}
