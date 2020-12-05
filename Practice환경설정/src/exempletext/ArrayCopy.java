package exempletext;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	int ori[] = {1,2,3,4,5,};
	int target[] = new int[10];
	//int count =0;
	System.out.println("복사하기전");
	System.out.println(Arrays.toString(ori));
	System.out.println(Arrays.toString(target));
	System.out.println(target.length);
	/*for(int i=0; i < ori.length; i++) {
		target[i] = ori[i];
		
	}
	for(int i : ori) {
		target[count++]= i;
		;
	}*/
	System.arraycopy(ori, 0, target, 0, ori.length);//복사속도가 가장 빠르다
	target = Arrays.copyOf(ori,ori.length);//Arrays.copyOf는 완전히 똑같이 복사
	System.out.println("복사후");
	System.out.println(Arrays.toString(ori));
	System.out.println(Arrays.toString(target));
	System.out.println(target.length);
   /*for(int i: ori) {	target[count++] = i;
   System.out.println(i);
}
   System.out.println(Arrays.toString(ori));
   System.out.println(Arrays.toString(target));*/
}
}
	