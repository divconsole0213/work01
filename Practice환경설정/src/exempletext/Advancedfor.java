package exempletext;

public class Advancedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(type values : array) {
		실행문;
		}*/
		int [] scores = { 95, 71, 84, 94, 37};
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
	}

}
