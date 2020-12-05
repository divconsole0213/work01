package weekwork;

import java.util.Scanner;

public class Calcurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		a. 양의 정수 2개를 입력 받기
//		b. 1:덧셈 / 2:뺄셈 / 3:곱셈 / 4:나눗셈 / 5:나머지 -> 메뉴
//		c. 계산 과정 및 결과 출력 -> 예) 3 + 5 = 8	

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		System.out.println("양의 정수를 입력하시오");
		i = sc.nextInt();
		j = sc.nextInt();
		if(i>0 || j>0) {
			System.out.println(i+"+"+j+"="+(i+j));
			System.out.println(i+"-"+j+"="+(i-j));
			System.out.println(j+"-"+i+"="+(j-i));
			System.out.println(i+"*"+j+"="+(i*j));
			System.out.println(i+"/"+j+"="+(i/j));
			System.out.println(j+"/"+i+"="+(j/i));
			System.out.println(i+"%"+j+"="+(i%j));
			System.out.println(j+"%"+i+"="+(j%i));
		}
		else {
			System.out.println("양의 정수로 다시 입력 바랍니다.");
		}
		sc.close();
		
}
}