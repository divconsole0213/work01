package Condition;

public class Quiz_Condition09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*9.아래의 조건을 참고 및 분석하여 코드를 작성해보세요
a. 랜덤으로 월(정수)을 출력받기
b. 해당 월을 영어로 입력받기
c. 대소문자 구별없이 처리하여 정답출력*/
	int b1 = (int)(Math.random()*13);//0~100
	System.out.println("숫자는 ="+b1);
	if(b1>2&&b1<6) {
		System.out.println("봄");
	}else if(b1>5&&b1>9) {
		System.out.println("여름");
	}
	else if(b1>5&&b1>9) {
		System.out.println("가을");
	}
	else if(b1>10&&b1>13&&b1<3) {
		System.out.println("겨울");
	}

	else {System.out.println("달은 1월에서 12월 까지입니다");
	}
	}
}
