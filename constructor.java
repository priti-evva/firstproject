package mywork;

  class Employee{
	int id;
	String name;
	int salary;
	static String companynm="Capgemini";
	/*constructor (int id,String name){
		System.out.println("your constructor is evoke");//constructor overloading
		
	}*/
	Employee(int id1,String n,int sal){
		id=id1;
		name=n;
		salary=sal;
		
		
	}
	static void change() {
		
		companynm="ABC";
	}
		
	void show() {
		/*System.out.println(id+" "+salary);
		System.out.println(id+" "+name);*/
		System.out.println(id+" "+name+" "+salary+" "+companynm);
	}
  }


	public  class constructor {
	public static void main(String[] args) {
		// new constructor(1,"priti");
		// new constructor(2,20000);
		Employee e=new Employee(1,"priti",40000);
		//e.companynm="ABC"; if u want to change company name
		
		Employee.change();
		e.show();
	

	}

}
