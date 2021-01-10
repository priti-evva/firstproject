package mywork;
interface Printable{  
void print();  
default void method() {System.out.println("bye");}//we can create method body in interface but it should declare defalult method
static int cube(int x){return x*x*x;} 
}  
interface Showable{  
void show();  
} 
interface Armin{
	void display(); 
}
class  X implements Printable,Showable,Armin{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
public void display(){System.out.print("hii");}
}

class  Multipleinherit{  
public static void main(String args[])
{
	X obj4=new X();
	Printable obj1=new X();//type casting
	//Showable obj2=new X();
	//Armin obj3=new X();
//Multipleinherit obj = new  Multipleinherit();  
obj4.print();  
obj4.show(); 
obj4.display();
obj4.method();
Printable.cube(3);//static method can only be accesss by this way only
 }  
}  


