
public class Execptionhandling {
	public static void main(String[] args) {
		try
		{
			String a =null;
			System.out.println(a.charAt(0));
		     String b="hello world";
			char c=b.charAt(10);
			System.out.print(c);
		}
		
		catch(StringIndexOutOfBoundsException ie)
		{
			System.out.println(ie.getMessage());
		}catch(NullPointerException ei) {
			//String a ="null";
			//System.out.println(a.charAt(0));
			System.out.println("Error");
			//throw new RuntimeException();
			
		}catch(RuntimeException re)
		{
			System.out.println("Runtime error has occured");
		}finally
		{
			System.out.println("reached to final block");
		}
		System.out.print("adsf");
		
		}
		
	/*public static void main(String[] args) {
		String a="java";
		
		if( a==null)
		{
			throw new StringIndexOutOfBoundsException();
		}
		else {
			System.out.println(a.charAt(0));
			System.out.println("reached to final block");
		}
	}*/

}
