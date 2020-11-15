package Condition;

import java.util.Scanner;

public class Quiz_Conditiion05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*5.아래의 조건을 참고 및 분석하여 코드를 작성해보세요
a.크기가 다른 양의 정수 3개를 입력받기
b.그 3개의 정수를 크기순으로 ">"부호를 이용하여 출력	
예)17>7>3*/
		Scanner a = new Scanner(System.in);
		System.out.println("1번숫자");
		int a1 = a.nextInt();
		System.out.println("2번숫자");
		int a2 = a.nextInt();
		System.out.println("3번숫자");
		int a3 = a.nextInt();
		if(a1>a2) {
			if(a2>a3) {
				System.out.println(a1 +">" + a2 +">" + a3);
			}else {
				System.out.println(a1 +">" + a3 +">" + a2);
			}
		}else if(a2>a3) {
			if(a3>a1) {
				System.out.println(a2+">"+a3+">"+a1);
				
			}else {
				System.out.println(a2+">"+a1+">"+a3);
			}
			}else if(a3>a1) {
				if(a1>a2) {
					System.out.println(a3+">"+a1+">"+a2);
				}else {
					System.out.println(a3+">"+a2+">"+a1);
				}
			}
		}
}





