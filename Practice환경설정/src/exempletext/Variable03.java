package exempletext;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte b1 = 127;//1byte
//byte b2 = b1 + 2; 오버플로우
byte b2 =(byte)(b1+2);//강제캐스팅
System.out.println(b1);
System.out.println("강제캐스팅 후 :" +b2);

int i = b1;//4byte자동캐스팅(향변환 코드 생략가능)
System.out.println("자동캐스팅 후 :" + i);
	
	
	byte b3 = 127;
	int i2 = 350;
	b3 = (byte)i2;//큰 바이트 >>작은바이트(데이터손실일어남)
	System.out.println(b3);
	
	//정수와 실수간의 캐스팅(저장하는 방식이 틀리기때문)
	//반드시 데이터 손실이 있고 명시적 캐스팅 코드 들어가야함
	
	int i3 = 100;
	float f1 = (float)i3;
	System.out.println("정수>실수"+f1);
	
	float f2 = 10.55f;
	int i4 = (int)f2;
	System.out.println("실수>정수"+i4);
	
    char ch = 'a';
    int i5 = ch;
    System.out.println("문자>정수"+i5);
    // 문자값을 정수타입으로 바꾸면 아스키값 출력
    
    int i6 = 100;
    String str = "자바"+i6;
    System.out.println(str);
    //애니타입+"" == 문자열
	}

}
