package exempletext;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("메세지를 입력");;
System.out.println("프로그램 종료 하려면 X입력");		
String inputString = null;

do{
	System.out.println(">");
	inputString = sc.nextLine();
//do - while은 최소 한번만 실행한다 이유는 조건이 뒤에있기 때문이다
	System.out.println(inputString);
	}
//X를 입력하면 ! False이기 때문에 루프를 빠져나간다!
while(!inputString.equals("X")); 
	sc.close();}
}

