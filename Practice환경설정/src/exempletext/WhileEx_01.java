package exempletext;

import java.util.Scanner;

public class WhileEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
boolean run = true;
int speed = 0;
while(run) {
	System.out.println("----");
System.out.println("1.증속/2.감속/3.중지");
System.out.println("입력");
int choice = sc.nextInt();
if(choice == 1) {
	speed++;
System.out.println("현재 속도:"+speed);

}
else if(choice == 2) {
	speed--;
	System.out.println("현재 속도:" +speed);
}
else if(choice == 3) {
//	break;
run = false;//flag 변수를 쓰는게 가장 합리적
	/*System.exit(0);*///system.exit는 시스템을 아예 끊어버린다
}

else {
	System.out.println("잘못입력하셨습니다");
}
System.out.println("프로그램종료");
}
sc.close();	
}
}
