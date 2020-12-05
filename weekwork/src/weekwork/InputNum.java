package weekwork;

import java.util.Scanner;

public class InputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a. 변수 inputNum에 정수 입력 받기
//		b. inputNum이 4과6의 공배수인지 4의 배수인지 6의 배수인
//		지 어느 배수도 아닌지 판단하여 출력

int inputNum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("숫자를 입력하시오");
inputNum = sc.nextInt();
if( inputNum %4==0 && inputNum % 6 == 0) {
	System.out.println("4와 6의 공배수");
}
else if( inputNum %4 == 00) {
	System.out.println("4의 배수");
}
else if(inputNum %6 == 00) {
	System.out.println("6의 배수");
}
else {
	System.out.println("4의 배수도 6의 배수도 아닙니다");
}
sc.close();
	}

}
