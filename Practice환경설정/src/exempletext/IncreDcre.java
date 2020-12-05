package exempletext;

public class IncreDcre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int x = 4;
int y = 7;
	
System.out.println("x=" + (x++));//가독성을 높이기 위한 괄호
System.out.println("x=" + x);// 세미콜론 이후 후위 증가한 값을 보여줌
System.out.println("y="+(++y));//전위증가
System.out.println("y="+y);
System.out.println("x+y="+(x+y));
System.out.println("x+y="+(x++)+(++y));//59인 이유  // 문자열로 5 . 9로 나오는 것임!!
System.out.println("x+y="+((x++)+(++y)));//16인 이유  괄호를 눈여겨서 잘보자!!
	}

}
