package Condition;

import java.util.Scanner;

public class Quiz_Condition03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*3.아래의 조건을 참고  및 분석하여 코드를 작성해보세요
 * a.사고싶은것과 그것의 가격 입력받기
 * b. 월 소득과 저축률 입력받기
 * c. 그것을 구입하는데 몇 개월 소요될 것인지 출력
 */
		Scanner a = new Scanner(System.in);
		System.out.println("사고싶은 물건?");
		String a1 = a.next();
		System.out.println("가격은?");
		int b1 = a.nextInt();
		System.out.println("월 소득은?");
		int b2 = a.nextInt();
		System.out.println("저축률은");
		double b3 = a.nextDouble();
		
		System.out.println("사고싶은 물건은:"+a1);
		System.out.println(a1+"의 가격은"+b1);
		System.out.println("월소득은"+b2);
		System.out.println((int)((b1/(b2*b3))+1)+"개월만 기다려");
	;}

}
