package weekwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
				// TODO Auto-generated method stub
//				a. 랜덤으로 월(정수)을 출력 받기
//				b. 해당 월을 영어로 입력 받기
//				c. 대소문자 구별 없이 처리하여 정답 출력
		
		
Scanner sc = new Scanner(System.in);


System.out.println((int)(Math.random()*12)+1);
		 System.out.println("지금 나오는 월을 영어로 입력하시길 바랍니다");
		   
		   
		   String  message = sc.nextLine();
		   
		   
		   if( message == "march" &&  message == "april" && message == "may") {
			   System.out.println("spring");
		   }
		   else if(message == "jun"&& message == "july" && message =="august") {
			   System.out.println("summer");
			   }
		   else if(message == "september" && message == "october" && message ==  "november") {
		  System.out.println("autumn");
		   }
		   else if (message == "december" && message == "january" && message == "february") {
				   System.out.println("winter");
			   }
		   else { 
				   System.out.println("잘못기입하셨습니다");}
	sc.close();	   
	}

		   
	
}
	


	 
			

		
	
	



	
	