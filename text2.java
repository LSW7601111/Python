// �ִ밪 max()�Լ� �����, �ּҰ� min()�Լ� �����

package text1;

public class text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max();
		
		int Mi=min();
		System.out.println("�ּҰ� : "+ Mi);
		
		int Av=avg();
		System.out.println("��հ� : "+ Av);
		
		double Bv=bvg(100,90,80,85);
		System.out.println("��հ� : "+ Bv);
		
		int Sum=sum();
		System.out.println("�հ� : "+ Sum);
				
		int a[]= {100,90,80,85};
		int Tum=tum(a);
		System.out.println("�հ� : "+ Tum);
		
		
	
	}
	
	
	public static void max() {
		int a,b,c,d,ma;
		a=10;b=20;c=30;d=40;ma=a;
		if(b>ma) ma=b;
		if(c>ma) ma=c;
		if(d>ma) ma=d;
		System.out.println("�ִ밪 : "+ ma);
		return;
	}
	
	public static int min() {
		int a,b,c,d,mi;
		a=10;b=20;c=30;d=40;mi=a;
		if(b<mi) mi=b;
		if(c<mi) mi=c;
		if(d<mi) mi=d;
		// System.out.println("�ּҰ� : "+ mi);
		return mi;
	}
		
	public static int avg() {
		int a,b,c,d,av;
		a=100;b=90;c=80;d=85;
		av=(a+b+c+d)/4;
		return av;
		}
	
	public static double bvg(double a, double b, double c, double d) {
		double av;
		av=(a+b+c+d)/4;
		return av;
		}
	
	public static int sum() {
		// int a[]=new int[10];
		int a[]= {100,90,80,85};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	
	}
	
	public static int tum(int[] a) {
		int tum=0;
		for(int i=0;i<a.length;i++) {
			tum+=a[i];
		}
		return tum;
	
     }	
	
}	
	
	
	
	
	
	
	
	
	

