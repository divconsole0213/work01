package exempletext;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//싱글루프일때
		//int i=1 >>초기화코드(최초1번만 실행)
		//1~100까지의 합을 구하는 반복문
		//i<=100 > 조건식(참이어야지만, 실행블럭 실행
		//i++ >>증감식
		int i= 1;
		int sum = 0;
		for( i= 1; i <= 100; i++) {
			sum += i;
		System.out.println(sum);
		}System.out.println(sum);
	}

}
