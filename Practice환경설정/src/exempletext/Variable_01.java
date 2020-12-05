package exempletext;

public class Variable_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch ='a'; 
		//기본형은 소문자로 시작 참조형은 대문자로 시작
		//char라는 문자기본형은 저장공간이 작아서 문자하나만 들어가므로 문자열(문자들 )에는 String이라는 참조형 class에 들어가게 된다
		int  year = 0;
int age = 42;

long result = 10L;//int보다 큰새끼 16byte
float result2 = 9.9999F;
double result3= 10.223;
System.out.println("ch:"+ch);
System.out.println(result);
System.out.println(result2);
System.out.println(result3);
System.out.println(year+age);
String str = new String("자바");
System.out.println(str+"자바");
System.out.println(str.toString());
Object obj1 = new Object();
System.out.println(obj1+"자바");//+""string값이 합해서 나옴요
	}

}
