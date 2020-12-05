package weekwork;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a. switch문 사용
//		b. 점수(정수) 입력 받기
//		c. 학점 100~90=A
//		89~80=B
//		79~70=C
//		69~60=D
//		59~0=F 판단 후 출력
	Scanner sc = new Scanner(System.in);
	int i = 0;
	System.out.println("점수를 입력하시오");
	i = sc.nextInt();
	switch(i/10) {
	case 10: 
		System.out.println("A");
		break;
    case 9: 
		System.out.println("A");
        break;
    case 8 :
     	System.out.println("B");
	    break;
	case 7:
	   System.out.println("C");
	   break;
    case 6:
	   System.out.println("D");
	   break;
	case 5:
	   System.out.println("F");
	   break;
   default:
       System.out.println("잘못기입하셨습니다");
   
    }
	sc.close();
	}

}
