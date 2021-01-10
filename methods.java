package mywork;
import java.util.Scanner;

public class methods {
	Scanner sc=new Scanner(System.in);
	private int rollnum;
	private String  name;
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum=rollnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	private void add() {
		System.out.print("enter roolnum");
		rollnum=sc.nextInt();
		System.out.println("name:");
		name=sc.next();
	}
	private void display() {
		System.out.println("rollnumber:"+ rollnum);
		System.out.println("name:"+ name);
		
	}
	public static void main(String[]args) {
		methods m=new methods();
		
		m.add();
		m.display();
	}

}
