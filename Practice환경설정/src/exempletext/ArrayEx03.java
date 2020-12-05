package exempletext;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		//public String toString() {
		//	return getClass().getName()+"@"+Integer.toHexString(hashCode());
		//}
		// TODO Auto-generated method stub
//40바이트가 힙에 생성되었다
		int[] arr1 = new int[10];
		char[] chArr = new char[] {'a', 'b', 'c'}; 
		//arr1배열에다 난수를 10개 대입하고 있다.
		
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*11)+1;
		}
		//배열의 값들을 출력하는 코드
		for(int i=0; i<arr1.length; i++) {
			if(i == 0) {
			System.out.println( arr1[i] );
			
			}
			else {
				System.out.println(arr1[i]+ ",");
			}
			System.out.println();
			//Arrays class는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
			System.out.println(Arrays.toString(arr1));
		    System.out.println(Arrays.toString(chArr));
		    //주소값출력
		    //출력 스트림에다가 참조변수를 넣으면, 자동적으로 참조변수명.toString()호출이 된다.
		    System.out.println(arr1.toString()); //type@16진수
		    System.out.println(arr1);
		    //char타입은 주소를 출력하려면 toString()호출해야 한다.
		    System.out.println(chArr.toString());
		    System.out.println(chArr);
		}
	}

}
