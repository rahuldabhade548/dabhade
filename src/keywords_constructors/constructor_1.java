package keywords_constructors;
public class constructor_1 {
	
	String Name;
	int age;
	String village;
	
	constructor_1 (String name,int age,String village){
		this.Name=name;
		this.age=age;
		this.village=village;
		
		System.out.println(this.Name +"  "+ age +"  "+  village);
		
	}
	

	public static void main(String[] args) {
		System.out.println("student name " +" age"+ " : " +"village");
		constructor_1 obj=new constructor_1("rahul", 25, "jalna");
		constructor_1 a=new constructor_1("bhushan", 23, "amravati");
		constructor_1 b=new constructor_1("yogesh", 23, "amravati");

	}

}
