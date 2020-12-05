package exempletext;

public class Ex_02 {

	public static void main(String[] args) {
		int sum = 0;
		int temp = 0;
		//디버깅 :디버그창으로 의도치 않게 넘어갔다면, 프로그램의 문제
		//발생한것으로 에러를 잡아나가는 과정을 디버깅이라고 합니다
		//breakpoint(종단점)설정 후, 실행시키면 F8을 누르면 한단계씩
		//진행시켜나가면서 변수의 값들을 살펴나가면서 에러를 쉽게 잡을 수 있다 
		// TODO Auto-generated method stub
//누적 합계가 2000이상일 때 i값을 출력하시오
	for(int i=1; i<=100; i++) {
		sum += i;
		if(sum >= 2000) {
			temp = i;
			break;
		
		}
	}System.out.println("2000이상일 때 i의 값" + temp
			);
	
	}

}
