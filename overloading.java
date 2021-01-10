package four;
class a{
	a(){
		System.out.println("hello");
	}
	int a=100;
	int b=300;
	
	public void getnum(int b) {
		this.b=b;
		System.out.println(b);
	
	}
}
class b extends a{
	b(){
		System.out.println("hiii");
	}
	int a;
	public void getnum() {
		a=200;
		super.getnum(34);
		System.out.println(super.a);
		System.out.println(a);
	}
}
public class overloading {
	public static void main(String[] args) {
	b obj=new b();
	obj.getnum();
	

}
}
