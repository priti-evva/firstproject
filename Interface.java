package mywork;
interface A{ 
  public static final int a=34;
void a();  
void b();  
void c();  
void d();  
}  
  


abstract class B implements A{  //if we dont write abstract keyword than class must implements all the method of interface
	
public void c(){System.out.println("I am c"+a);}  
  
} 
//class M extends B implements A{  //valid
	class M extends B	{
public void a(){System.out.println("I am a");} 
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class Interface{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}  




