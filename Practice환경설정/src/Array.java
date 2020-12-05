
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] ball = new int [5];
for(int i = 0; i<ball.length; i++) {
	ball[i] = (int)(Math.random()*45)+1;
}
System.out.println("정렬전");
for(int i = 0; i<ball.length; i++) {
	System.out.println(ball[i]);
}//버블 소팅(정렬)
for(int i = 0; i<ball.length;i++) {
	for(int j=0; j<ball.length-1;j++) {
		if(ball[j] < ball[j+1]) {
			
			int temp = ball[j];
			ball[j] = ball[j+1];
			ball[j+1] = temp;
		}
	}
}
System.out.println("정렬후");
for(int i=0; i<ball.length; i++) {
	System.out.println(ball[i]);
}
	}

}

//왜 굳이 이렇게 까지 하는거지 ㅠㅠㅠㅠ
