package Condition;

import java.util.Scanner;

public class Quiz_Condition08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*8.아래의 조건을 참고 및 분석하여 코드를 작성해보세요
		a. 월(정수)을 입력받기
		b. 사계절 중 월에 맞는 계정 출력
		c. 정상법위의 정수가 아니면 "정상적인 월을 입력" 출력
		*/
		Scanner a = new Scanner(System.in);
		System.out.println("무슨 월의 계절이 궁금합니까?");
        int b1 = a.nextInt();
        if(b1 > 2 && b1 < 6) {
        	System.out.println("봄입니다");
        	}
        else if(b1>7 && b1 < 9) {
        	System.out.println("여름");
        }
        else if(b1>10 && b1 < 12) {
        	System.out.println("가을");
        }
        else if (b1>12 && b1 < 13 && b1<3) {
        	System.out.println("겨울");
        }
        else {
        	System.out.println("달은 1월에서 12월까지입니다 ^^");
        }
	}

}
