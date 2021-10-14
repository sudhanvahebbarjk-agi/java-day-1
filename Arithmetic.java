package training;
import java.util.*;

public class Arithmetic {
	
	void add(int a,int b) {
		System.out.println("Sum : "+(a+b));
	}

	void sub(int a,int b) {
		System.out.println("Sub : "+(a-b));
	}
	
	void mul(int a,int b) {
		System.out.println("Mul : "+(a*b));
	}
	
	void div(int a,int b) {
		System.out.println("Div : "+(a/b));
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=scanner.nextInt();
		System.out.print("Enter second number : ");
		int b=scanner.nextInt();
		
		Arithmetic ar=new Arithmetic();
		ar.add(a,b);
		ar.sub(a, b);
		ar.mul(a, b);
		ar.div(a, b);
		
	}

}
