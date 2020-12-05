package weekwork;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a. 월(정수)을 입력 받기
//		b. 사계절 중 월에 맞는 계절 출력
//		c. 정상 범위의 정수가 아니면 “정상적인 월을 입력” 출력
		
		Scanner sc = new Scanner(System.in);
		int m = 0;
		System.out.println("'월'을 입력하시오");
		 m = sc.nextInt();
		 if(m==3 || m==4 || m==5) {
			 System.out.println("봄");}
		 else if(m==6 || m==7 || m==8) {
			 System.out.println("여름");
		 }
		 else if(m==9 || m==10 || m==11) {
			 System.out.println("가을");
	}
		 else if(m==12 || m==1 || m==2) {
			 System.out.println("겨울");
		 }
		 else {
			 System.out.println("정상적인 '월'을 다시 입력바랍니다");
		 }
	sc.close();	
		
	}

}
