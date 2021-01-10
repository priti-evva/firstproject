class  Student{
	int rollnum;
	int fees;
	String name;
	String city;
	Student(){
		//this(3,60000,"riya");//calling parametarized constructor from default constructor
	}
	Student(int rollnum,int fees,String name){
		//this();//constructor call should be the 1st statement in  the constructor#ivoking constructor
		this.rollnum=rollnum;
		this.fees=fees;
		this.name=name;
		//rollnum=rollnum;
		//fees=fees;//its create an ambiguity
		///name=name;
		
	}
	Student(int rollnum,int fees,String name,String city){
		
		this(rollnum,fees,name);//real use of this keyword

		this.city=city; 
	                   
	}
	public void show() {
		System.out.println(rollnum+" "+fees+" "+name+""+city);
		this.m1();//ivoking the current class method
	
	}public void m1() {
		System.out.println("hello");
	}
	
	
}
public class thiskeyword {

	public static void main(String[] args) {
		
		Student s=new Student(1,50000,"ronita");
		//Student s=new Student();
		s.show();
		// TODO Auto-generated method stub

	}

}
