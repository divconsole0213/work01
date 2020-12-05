package exempletext;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ctrl+shift+o 자동import
		//Scanner class는 입력을 받기 위한 클래스
		//자원(resource)은 사용하고 나서 반드시 닫아줘야 한다
		
	Scanner sc = new Scanner(System.in);
    /*System.out.print("정수 한자리를 입력");
	int num = sc.nextInt();
	System.out.println("사용자로부터 입력받은숫자:"+num);
	
	System.out.print("실수 한자리를 입력");
	Double dnum = sc.nextDouble();
	System.out.println("사용자로부터 입력받은숫자:"+dnum);
	*/
	System.out.print("문자열 입력");
	/*String str = sc.next();next()는 공백을 기준으로 해서 문자를 받음 :단어입력받을 때 좋음
	*/
	//nextLine()는 엔터키를 입력할때까지 문자열을 입력
	/*String str = sc.nextLine();
	System.out.println("사용자로부터 입력받은 문자열:"+str);*/
	int result = 100;
	
	String num = sc.nextLine();
	//Integer.parseInt(num);//Integer.parseInt()역할: 문자열로 입력받은 숫자들을  문자열이 아니라 
	//숫자로 바꿔주는 역할
	int num = Integer.parseInt(str);
	String
	total = result+num;
	System.out.println("사용자로부터 입력받은 문자열:"+total);
	sc.close();
	}

}
