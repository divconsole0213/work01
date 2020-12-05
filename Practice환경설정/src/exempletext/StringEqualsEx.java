package exempletext;

public class StringEqualsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//참조형 타입의 ==, i==에 대해서 이해할 수 있다.
		String str1 = "아이티고";
		String str2 = "아이티고";
		String str3 = new String("아이티고");
		
		//참조형 타입에서 서로 ==은 주소비교를  비교하고 있음
		//같은 리터럴의 경우는 같은 번지를 공유함
		//리터럴인 경우 같은 값이 있는지, 먼저 메모리공간(heap)에 있는지
		//확인하고 있다면 같은 주소를 공유하게 되고, 없다면 새로운 곳에
		//인스턴스를 생성해준다
		//new연산자 오면 무조건 새로운 인스턴스가 생성됨
		boolean result = (str1 == str2);
		System.out.println("str1 == str2:" +result);
	
	result = (str1 == str3);
	System.out.println("str1 == str3:" +result);
	
	result = str1.equals(str3);
	System.out.println("str1.equals(str3):"+result);
	
	//eqauls라는 메소드는 값만 비교
	}

}
