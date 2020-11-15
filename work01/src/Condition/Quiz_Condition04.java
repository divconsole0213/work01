package Condition;

import java.util.Scanner;

public class Quiz_Condition04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4. 아래의 조건을 참고 및 분석하여 코드를 작성해보세요
 * a. 변수 inputNum에 정수 입력받기
 * b. inputNUM이 4와 6의 공배수인지 4의 배수인지 6의 배수인지 어느배수도 아닌지 판단하여 출력
 * 
 */
		Scanner num = new Scanner(System.in);
		int a1 = num.nextInt();
		if(a1% 12 == 0) {
			System.out.println(a1+"=4와 6의 공배수");
		}else if(a1%4==0) {System.out.println(a1+"=4의 배수");
		}else if(a1%6==0) {
			System.out.println(a1 +"=6의 배수");
			
		}else {
			System.out.println("그무엇도 아니다");
		}
		}
}
