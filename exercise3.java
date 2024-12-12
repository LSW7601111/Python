package text1;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주민번호 체크 알고리즘
		// 주민번호 :  8 0 1 1 0 4 1 0 0 1 3 2 2
		// 가중치   :  2 3 4 5 6 7 8 9 2 3 4 5  
		int[] jumin = {8,0,1,1,0,4,1,0,0,1,3,2,2};
		int[] w = {2,3,4,5,6,7,8,9,2,3,4,5};
		int digitcheck;
		
		juminCheck(jumin, w);
				
		
	}
	public static boolean juminCheck(int[] jumin, int[] w) {
		int check=0;
		for(int i=0;i<w.length;i++) {
			check=check+(jumin[i]*w[i]);
				
		}
		check=check%11;
		check=11-check;
		check=check%10;
		System.out.println(check);
		return true;
	}		
}

// 주민번호 체크함수
// 1. (번호 * 가중치)들의 합계를 구하고  :  16+0+4+5+0+28+8+0+0+3+12+10
// 2. 합계%11(합계를 11로 나눈 나머지)  -->  :             86%11 => 9
// 3. 11-나머지  --> 값 0,1,2,3,...,9,10                 11-9=> 2
// 4. 값%10 나머지 --> 값  2%10                                =>2