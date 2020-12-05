package weekwork;

import java.util.Scanner;

public class Buying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a. 사고 싶은 것과 그 것의 가격 입력 받기
//b. 월 소득과 저축률 입력 받기
//c. 그것을 구입하는데 몇 개월 소요될 것인지 출력
		
	Scanner sc = new Scanner(System.in);	
	System.out.println("사고싶은 것이 무엇입니까?");
    String message = sc.nextLine();
    System.out.println("그 물건의 가격은 얼마에요?");
	int price = sc.nextInt();
	System.out.println("당신의 월급은 얼마입니까?");
	int pay = sc.nextInt();
	System.out.println("한달 저축은 얼마하셔요?");
	int saving = sc.nextInt();
	System.out.println(price/(price/(pay/saving))+"개월 이면 사실 수 있습니다");
	
	
	
	
	sc.close();}

}
