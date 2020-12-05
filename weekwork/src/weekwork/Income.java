package weekwork;

import java.util.Scanner;

public class Income {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*a. 변수 income에 예상 소득(정수) 입력 받기
 *b. 변수 tax(실수)를 이용해 소득세 출력
  c. 소득세 계산방법은 구글 검색해 보기*/
        
		int income = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("예상 소득을 입력하시오");
		income = sc.nextInt();
		if(income<=12000000) {
			System.out.println(income*0.06+"원");
		}
		else if(income>12000000 || income<=46000000) {
			System.out.println(((income*0.15)-1080000)+"원");
		}
		else if(income>46000000 || income<=88000000) {
			System.out.println(((income*0.24)-5220000)+"원");
		}
		else if(income>88000000 || income<=150000000) {
			System.out.println(((income*0.35)-14900000)+"원");
		}
		
		else if(income>150000000|| income<=300000000) {
			System.out.println(((income*0.38)-19400000)+"원");
		}
		else if(income>300000000|| income<=500000000) {
			System.out.println(((income*0.40)-25400000)+"원");
		}
		else if(income<500000000) {
			System.out.println(((income*0.42)-35400000)+"원");
		}
		else {
			System.out.println("다시 입력하시오");
		}
			sc.close();
	}

}
