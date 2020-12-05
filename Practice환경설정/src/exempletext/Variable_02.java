package exempletext;

public class Variable_02 {
//class영역
	public static void main(String[] args) {
		int number;
		number = 100;
		int number2 = 200;
		double p7 = 10.0; 
		double s$ =10.1;
		 final int Max = 400;
	//Max = 100;이런건 못함  ㅇㅋ?
		System.out.println(number);
		System.out.println(number2);
		String str = new String("붕어빵");
		System.out.println(str);
		str = null;
		System.out.println(str);
		System.out.println(p7);
		System.out.println(s$);
		System.out.println("상수"+Max);
		//str의 값이 바뀜을 찍어주네 콘솔이 시발 나도 뭔소린지 모르겠다
//main영역
	}
}