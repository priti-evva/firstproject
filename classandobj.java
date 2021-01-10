package mywork;
class alpha{
	int r;
	
	
	 void add(int rollnm) {
		  r=rollnm;
	 }
	
	void show() {
		
		System.out.println(r);
	}
}
public class classandobj {
	

	public static void main(String[] args) {
		alpha co=new alpha(),c1=new alpha();
		co.add(23);
		co.show();
		c1.add(1);
		c1.show();
		
		
		

	}

}
