package keywords_constructors;

public class thiskeyword {
	
	int a;
	
	public void m1(int a) {
		this.a=a;
		
	System.out.println("i am m1"+" "+this.a);
	}

	
	public void m2 () {
		this.m1(20);//method calling
	}
	public static void main(String[] args) {
	
		thiskeyword obj =new thiskeyword();
		obj.m1(10);
		obj.m2();
		
	}

}
