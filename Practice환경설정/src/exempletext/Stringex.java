package exempletext;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str = "부장"; 
switch(str) {
case "부장": System.out.println("500만원");
	        break;
case "차장": System.out.println("400만원");	        
	        break;
case"과장": System.out.println("350만원");
	       break;
case"대리" :System.out.println("250만원");
	       break;
case"사원" : System.out.println("200만원");
	       break;
	default:
		System.out.println("공제");
}
	
	}

}
