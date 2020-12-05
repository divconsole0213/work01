package exempletext;

public class Method {
	//메서드의 선언부 구성
	//1.리턴타입(반환값) : int
	//2. 메서드명
	//3.() : 매개변수, 인자값, Arguments
	//메서드 선언부 중요도(98%), 메서드 구현부(정의부)
 public static int add( int x,int y,int z) {
//	 int temp = 0;
//	 temp = x + y + z;
	 System.out.println("+method 호출");
	 return  x + y + z;
	 //왜 syso가 return윗줄이어야 하는가...
	 
 }
 public static int minus(int a, int b) {
	System.out.println("-method 호출"); 
	
	return a-b;
	 
 }
 
 public static int divide(int e, int f) {
	 System.out.println("/method 호출");
	 return e/f;
 }
public static int multifly(int c, int d) {
	System.out.println("*method호출");
	return c*d;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 10;
int num2 = 30;
//값에 의한 복사(call by value)
int result = Method.add(num1,num2,100);
System.out.println(result);
		
result = minus(num1, num2);
System.out.println(result);

result = multifly(num1, num2);
System.out.println(result);

result = divide(num1,num2);
System.out.println(result);

	}

}
