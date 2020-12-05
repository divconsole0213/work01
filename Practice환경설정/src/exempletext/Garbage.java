package exempletext;

public class Garbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		//int number; 쓰레기값  int number; number=100; int의 변수명지정 변수명에 들어갈 수 지정
		//int number= 100;(선언과 동시에 초기화: 선언과 동시에 값을 지정함)
			String str = new String("boy");
			str = null;
			//null값으로 덮어씌우기됨  이 애쌔끼는 쓰지도 못하고 쓰레기 객체가 됨 
			//그래서 garbage collector라는  쓰레기 분리공간으로 처분됨
		 System.out.println(number);
		 System.out.println(str);
		}
		}