package Condition;

import java.util.Scanner;

public class Quiz_Condition06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 6. 아래의 조건을 참고 및 분석하여 코드를 작성해보세요
		 * a. 크기가 다른 양의 정수 2개를 입력받기
		 * b. 2 개의 정수중 더 큰 숫자를 출력
		 * c. 큰 숫자에서 작은 숫자를 뺀값을 출력
		 */
		Scanner a1 = new Scanner(System.in);
		System.out.println("크기가 다른 양의 정수 2개를 입력하시오");
		int b1 = a1. nextInt();
		System.out.println("one more");
		int b2 = a1. nextInt();
		if(b1>b2) {
			System.out.println(b1+"=더 큽니다"+"and큰 숫자에서 작은 숫자를 뺀값은"+(b2-b1));
		}else {
			System.out.println(b2+"=the bigger"+"and큰 숫자에서 작은 숫자를 뺀값은"+(b2-b1));
		}

	}

}
