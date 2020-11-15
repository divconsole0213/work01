package Condition;

import java.util.Scanner;

public class Quiz_Condition02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*a.변수 income에 예상 소득(정수)입력받기
  b.변수 tax(실수)를 이용해 소득세 출력
  c.소득세 계산방법은 구글 검색해보기*/
		
		try (Scanner income = new Scanner(System.in)) {
			int tax = income.nextInt();
			if(tax<=1200) {
				System.out.println("1200만원 이하"+tax*0.06);}
			else if (tax> 1200 && tax<=4600) {
				System.out.println("1200만원 초과~4600만원이하:"+(int)(tax*0.15)+72);
			}
			else if (tax> 4600 && tax<=8800) {
				System.out.println("4600만원 초과~8800만원이하:"+(int)(tax*0.15)+582);
			}
  
			else if (tax> 8800 && tax<=15000) {
				System.out.println("8800만원 초과~15000만원이하:"+(int)(tax*0.15)+1590);
			}
  
			else if (tax> 15000 && tax<=30000) {
				System.out.println("15000만원 초과~30000만원이하:"+(int)(tax*0.15)+3760);
			}
  
			else if (tax> 30000 && tax<=50000) {
				System.out.println("30000만원 초과~50000만원이하:"+(int)(tax*0.15)+9460);
			}
  
			else  {
				System.out.println("5억원 초과"+(tax*0.15)+17460);
			}
		}
	}};
  

