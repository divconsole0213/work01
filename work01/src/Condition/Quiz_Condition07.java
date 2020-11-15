package Condition;

import java.util.Scanner;

public class Quiz_Condition07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*7. 아래의 조건을 참고 및 분석하여 코드를 작성해보세요
 *a.양의 정수 2개를 입력받기
 *b. 1:덧셈 / 2:뺄샘/ 3:곱셈 / 4:나눗셈 / 5:나머지메뉴
 */
		Scanner a = new Scanner(System.in);
		System.out.println("양의 정수 2개를 입력하시오");
		int b1 = a.nextInt();
		System.out.println("하나 더 ");
        int b2 = a.nextInt();
        System.out.println(b1+"+"+b1+"="+(b1+b1));
        System.out.println(b1+"-"+b2+"="+(b1-b2));
        System.out.println(b1+"*"+b2+"="+(b1*b2));
        System.out.println(b1+"/"+b1+"="+(b1/b2));
        System.out.println(b1+"%"+b1+"="+(b1%b2));
	}

}
