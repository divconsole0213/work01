package exempletext;

import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sc는 resource이기때문에 닫아줘야합니다 ^^
Scanner sc = new Scanner(System.in);
System.out.print("점수를 입력");

		int Score =sc.nextInt();
//score변수의 값에 따라서 아래의 조건문에서 분기가 일어나고 있는 점이
//이 예제의 핵심
if(Score >= 90)
{System.out.println("A");
System.out.println("추카");
}
else if(Score>=80)
{System.out.println("B");
	}
else if(Score>=70) {
	System.out.println("c");
}
else {
	System.out.println("공부더하시길");
}
sc.close();
	}
}

