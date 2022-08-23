package keywords_constructors;

public class palindron {

	public static void main(String[] args) {
		
  int number=12321;
  int b=number;
  int rev=0;
		
    while(b!=0) {
    int rem=b%10;
    rev=rev*10+rem;
    b=b/10;
    }
    if(number==rev) {
    	
    	System.out.println("number is palindron");
    }else {
    	System.out.println("not palindron number");
    }
		
		
		
		
	}

}
