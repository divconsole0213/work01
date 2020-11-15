package Condition;

import java.util.Scanner;

public class Quiz_Condition10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*10.아래의 조건을 참고 및 분석하여 코드를 작성해보세요
a.switch문사용
b.점수(정수)입력받기
c.학점100~90=A
     90~80=B
     80~70=C
	 70~60=D
	 59~0=F*/
		
	Scanner a1 = new Scanner(System.in);
	System.out.println("학점입력");
	int b1 = a1.nextInt();
	int b2 = b1/10;
	switch(b2) {
	case 10 :
		System.out.println("A");
		break;
	case 9 :
		System.out.println("B");
		break;
	case 8 :
		System.out.println("C");
        break;
	case 7 :
        System.out.println("D");
        break;
	case 6 :
		System.out.println("F");
		break;
	case 5 :
		System.out.println("F");
		break;
	case 4 :
		System.out.println("F");
		break;
	case 3 :
		System.out.println("F");
		break;
	case 2 :
		System.out.println("F");
		break;
	case 1 :
		System.out.println("F");
		break;
		default:
			System.out.println("학점은 0부터 100까지입니다");
	
	}
	}

};
