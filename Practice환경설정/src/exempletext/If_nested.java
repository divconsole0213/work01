package exempletext;

import java.util.Scanner;

public class If_nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
System.out.println("입력");
int score = sc.nextInt();

if(score >=90) {
	if(score >=95) {System.out.println("A+");
}
	else {System.out.println("A");
	}
}
	else if(score >=80) {
	if(score >=85) {System.out.println("B+");}
	else {System.out.println("b");
	}
}
	

sc.close();
}
}

//중첩 if문은 무제한적으로 중첩 if문은 들어갈수 있다
//보통, 중첩if문은 2개를 초과하지 않도록 하는게 가독성 면에 좋다