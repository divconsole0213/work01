package weekwork;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		/*a. 변수 input에 정수 입력 받기
		  b. 변수 input을 50을 기준으로 이상 or 이하 판단 후 출력
		  c. else문으로 음수 및 문자 입력 시 예외처리 하기*/
		int input =0;	
	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		input = sc.nextInt();
	    
		  if(input>=50) {
			  
			  System.out.println("50 이상");
		  }
		  
		  else if(input<=50) {
			  System.out.println("50이하");
		  }
		  else { 
			 
			   System.out.println("EXCEPTION");
			
		  }
		 
		  
		  
	sc.close();
	}

}
