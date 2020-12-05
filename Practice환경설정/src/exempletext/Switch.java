package exempletext;



public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int이하의 정수값, string값
		
int score = 100;
		switch(score/10) {
		case 10:
		 System.out.println("100점");
		 break;
		case 9:
			System.out.println("90");
			break;
		case 8:
			System.out.println("80");
		    break;
		case 7 :
			System.out.println("70");
            break;
		case 6:
			System.out.println("60");
            break;
		 default:
			 System.out.println("no");
		}

	}

}
