package operator;

public class Ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x = 10;
 int b = 8;
int result = x + b;
System.out.println("더하기 결과" + result);
result = x - b;
System.out.println("빼기"+result);

result = x * b;
System.out.println("*"+result);
	
	
	result = x / b;
	System.out.println("나누기"+result);
	
	result = x % b;
	System.out.println("나머지"+result); //나누고 난 후 나머지 결과
	
	try {
		result = x / b;
		System.out.println(result);
	} catch (Exception e) {
		System.out.println("not");
		
	}
	
	
	
	}

}
