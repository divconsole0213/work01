package exempletext;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[]score = null;//score는 참조변수이다. int[]이다.
 //방도 만들지 않았는데 , 값을 대입을 하고 있다.(문법에러)
 //score = {100,29};
 //score는 5개의 방을 힙에다가 생성하고 있다.(20byte)
 score = new int[5];
 //배열명이 곧 주소다.
 System.out.println(score);
for(int i = 0; i < score.length; i++) {
	System.out.println("score["+i+"]="+score[i]);
}
System.out.println();
score[0] = 100;

for(int i = 0; i < score.length; i++) {
	score[i]=i+10;
	System.out.println(score[i]);
}
//대입



//출력
	score[0] =20;
	for(int i = 0; i < score.length; i++) {
		System.out.println("score["+i+"]="+score[i]);}

}
}
//score[0] = 변수와 동일하다고 본다
//score는 주소다 []에 들어가는 숫자는 index다