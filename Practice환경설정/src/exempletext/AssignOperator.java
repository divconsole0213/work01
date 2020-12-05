package exempletext;

public class AssignOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//복합대입 연산자를 이해할 수 있도록 하자
		int result = 0;
		//복합대입 연산자는 값을 누적시킬때 많이 사용한다
		result += 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 5;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 5;
		System.out.println(result);
		//지속적으로 변수를 쓰고 누적하며 쓸 수 있다
	}

}
