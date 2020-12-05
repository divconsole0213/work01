package exempletext;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//실행한 후 조건 검 
		
//사용자에게 입력받은 후q라면  종료
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지입력하시오");
		System.out.println("종료하려면 q를 입력하시오");
		String str = null;
		//do-while문은 최소 한번 이상 무조건 수행을 하는 반복문
		//이유는 조건문이 뒷부분에 존재하기 때문 
		do{System.out.print(">");
		//String클래스의 next는 공백 만나기 까지만 return 한단어만 입력받았을때 쓸 수있는 메서드
			str = sc.nextLine();
			System.out.println("입력받은 메세지:"+str);
		}while(!str.equals("q"));
		System.out.println("프로그램종료");
		sc.close();
	}

}
