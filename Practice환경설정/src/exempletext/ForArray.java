package exempletext;

public class ForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] original = new int[] {10,5,7,8,2};
		int[] cloned = new int[10];
		//for문 복사
		for(int i =0; i<original.length; i++) {
			cloned[i] = original[i];//original의 값을 cloned로 대입하고 있다.
		}
System.arraycopy(original, 0, cloned, 0, original.length);
	//배열 복사의 또다른 방법 arrays class의 copyof(), copyofrange()이용
}
	

}
