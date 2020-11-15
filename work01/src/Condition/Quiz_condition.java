package Condition;

import java.util.Scanner;

public class Quiz_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 1. 아래의 조건을 참고 및 분석하여 코드를 작성해보세요.
 * a. 변수 input에 정수 입력받기
 * b. 변수 input을 50 기준으로
 * 이상 or 이하 판단 후 출력
 * c. else문으로 음수 및 문자 입력시 예외처리하기
 */
	@SuppressWarnings("resource")
	Scanner num1 = new Scanner(System.in);
	int num = num1.nextInt();
	if(num>0 && num<50) {
		System.out.println("50이하");
	}else if(num>50) {
		System.out.println("50초과");
	}else {
		System.out.println("-입니다");
	}
	}

};
