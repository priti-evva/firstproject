class This{
	void m1(This obj) {
		System.out.println("hey");
	
	}void m2(){
		m1(this);//passing this as an argument
		
	}
	void show() {
		System.out.println("m1");
	}
	
	
}
public class thiskeywordasArgument {

	public static void main(String[] args) {
		This t=new This();
		t.m2();
		// TODO Auto-generated method stub

	}

}
