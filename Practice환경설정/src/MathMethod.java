import java.util.Scanner;

public class MathMethod {
	
	public static int add(int a,int b,int c);
	{   System.out.println("+method");
		return a + b + c;
		
	}

 public static void main(String[] args){
	

	
	Scanner sc = new Scanner(System.in);
	
	int x, y, z;
		System.out.println("x값을 입력하시오");
	x = sc.nextInt();

	System.out.println("y값을 입력하시오");
	
	y = sc.nextInt();
	
	System.out.println("z값을 입력하시오");
	z = sc.nextInt();
	
	
	int result = add(x,y,z);
	System.out.println(result);
	
	
	}
}
