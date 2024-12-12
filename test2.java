package text1;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {90,80,70,60,50,10};
		int sum = sum(a);
	}
		static int sum(int []a) {
			int hap=0;
			for(int i=0;i<a.length;i=i+2) {
				hap+=a[i];
			}
			System.out.println(hap);
			return hap;
	}

}

