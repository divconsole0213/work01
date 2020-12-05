import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String Array learning
		//object(class) array --2차원 배열
		//String str = new String("자바");
		//System.out.println(str);//str = str.tostring 
		
		String[]str = new String[] 
				{"안녕","홍길동","김연아"		};
		for(int i= 0; i<str.length; i++) 
		{ System.out.println(str[i]);
	}
		System.out.println("String배열의 주소:" + str.toString());
//Object class는 모든 클래스의 최고조상
		//String class는 object class의 toString()overriding 제정의
		str[0] ="rabbit";
		/*System.out.println(str[0]);
		System.out.println(Arrays.toString(str));
		System.out.println(str.toString());
		System.out.println(str[0].toString());
*/		
		//향상된 for문
		for(String str1 : str) {System.out.println(str);}
		//for(대입받을 변수정의 : 배열명)
}
}