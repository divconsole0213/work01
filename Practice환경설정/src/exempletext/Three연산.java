package exempletext;

import java.util.Scanner;

public class Three연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("점수를 받으시오");


Scanner sc = new Scanner(System.in);
int Score = sc.nextInt();

String grade = (Score >= 90)? "A" : "B";
System.out.println(grade);
//삼항 연산자를 중첩해서 씀
grade = (Score >= 90)? "A" :((Score >= 80)? "B" : "C");//대괄호부터 읽음
System.out.println(grade);
sc.close();
	}

}
