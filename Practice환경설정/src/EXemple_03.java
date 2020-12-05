
public class EXemple_03 {

	public static void main(String[] ab) {
		// TODO Auto-generated method stub
//main()의 매게변수의 활용하는 방법
		if(ab.length != 2) {
			System.out.println("program using tool");
			System.out.println("id & p"
					+ "assword insert");
		}
		
		String  str1 = ab[0];
		String str2 = ab[1];
		String str3 = ab[3];
		//string str4 = ab[4];
		
		System.out.println("id : " + str1);
		System.out.println("password : " + str2);
		//int count= str1; : !type
		//solution  
		int count = Integer.parseInt(str1);
		int total = count + 500;
		System.out.println("count 값 : " + count);
		
	}

}
 