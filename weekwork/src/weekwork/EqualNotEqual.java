package weekwork;

import java.util.Scanner;

public class EqualNotEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a. 크기가 다른 양의 정수 2개를 입력 받기
//		b. 2개의 정수 중 더 큰 숫자를 출력
//		c. 큰 숫자에서 작은 숫자를 뺀 값을 출력
int i = 0;
int j = 0;
Scanner sc = new Scanner(System.in);
System.out.println("크기가 다른 숫자 2개를 입력하시오");
 i = sc.nextInt();
 j = sc.nextInt();
 if(i>j) {
	 System.out.println(i);
     System.out.println(i-j);
 }
 else if(i<j) {
	 System.out.println(j);
	 System.out.println(j-i);
	 }
 
 
 sc.close();
	}

}
