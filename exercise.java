package text1;

public class exercise {

	public static void main(String[] args) {
		// 오름차순으로 정리 하시오
		int[] a = {90,80,70,60,50,10};
		prn(a);
		ascSort(a);
		prn(a);
		
	}

	public static void ascSort(int[] a) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
	           	}
			}
		}
		
		
	}
		
	public static void prn(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
	}
	
		
	
	
	
	
	
	
	
	}	
