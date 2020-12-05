package exempletext;

public class SecondArray_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[][] score = new int[] [] {
	{100,70,50},
	{70,50,30},
     {50,80,70},
     {55,85,77},
     {100,80,75}};
//과목별 총점
     int korTotal = 0; //국어
     int engTotal = 0;
     int mathTotal = 0;
     int totalsum = 0;
     double totalavg = 0;
     System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
    System.out.println();
     
    for(int i=0; i<score.length; i++) {
    	int sum =0; //개인별 총점
    	double avg =0.0; //개인별 평균
    	korTotal += score[i][0];
    	engTotal += score[i][1];
    	mathTotal += score[i][2];
    	//System.out.print(i+1);
    	System.out.printf("%3d",i+1);
    	for(int j =0; j<score[i].length; j++) {
    		sum += score[i][j];
    		System.out.print("\t"+score[i][j]);
    	}
    	totalsum += sum; //총합계
        avg = (double)sum / score[i].length; //개인별 평균
        totalavg += avg;
        System.out.printf("\t%d \t%.2f%n", sum, avg);
      /*  System.out.printf("\t" + sum + "\t"+ avg);*/
        System.out.println();
        //printf() %d <-형식지정자의 갯수만큼 그에 대입되는 변수가, 구분되어 제시
   //%n은 개행(줄바꿈)
    }
	   totalavg /= score.length;
	   System.out.printf("총점\t%d\t%d\t%d\t%d\t%.2f",korTotal, engTotal, mathTotal, totalsum, totalavg);

	   
	
	}
	
		
	}


