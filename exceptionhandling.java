
public class exceptionhandling {

	public static void main(String[] args) {
		try
		{
			String a =null;
			System.out.println(a.charAt(0));
		
		try
		{
			String b="hello world";
			char c=b.charAt(10);
			System.out.print(c);
		}
		catch(StringIndexOutOfBoundsException ie)
		{
			System.out.println(ie.getMessage());
		}
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			try
			{
				String a1 =null;
				System.out.println(a1.charAt(0));
			
			}catch(NullPointerException ei) {
				System.out.println("Error");
				
			}
		}
		
	

	}

}

