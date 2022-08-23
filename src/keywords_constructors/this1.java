package keywords_constructors;

public class this1 {
	
	this1 (int a){
		System.out.println("i am parametraised constructor");
	}
	
	
	this1 (){
		
		
		System.out.println("i am default constructor");
	}
  
	
	
	public static void main(String[] args) {

   this1 obj =new this1();// this is default constructor so he called only default constructor
		
      // we want to call another constructor then create another object
   
       this1 obj1 = new this1(10);


	}

}
