import java.util.Scanner;

public class Inputgugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("구구단을 출력합니다");
System.out.print("몇단부터 출력할까요?");
int start = sc.nextInt();
System.out.print("끝단은 얼마입니까?");
int end = sc.nextInt();
for( ; start <= end ; start++) {
	for( int j = 1; j <10; j++) {
		System.out.println(start+"*"+j+"="+(start*j));
}
	}
		/*무한루프 만들수 있으나 무한루프는 while이 더나음
		while(true){
System.out.println("^^");	*/
sc.close();
	}
}

