
public class employee {
	int id;  
	String name;  
	address address;  
	  
	public employee(int id, String name,address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.zipcode+" "+address.postalcode);  

}
	public static void main(String[] args) {  
		address address1=new address(123,"UP",421001);  
		address address2=new address(456,"MP",421002);  
		  
		employee e=new employee(111,"varun",address1);  
		employee e2=new employee(112,"arun",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
		}  
