package text1;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coinUnit[] = {500,100,50,10};
		int money = 3790;
		coinCount(coinUnit, money);
	}
	
	public static void coinCount(int[] coinUnit, int money) {
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"¿ø:"+ money/coinUnit[i]);
			money=money%coinUnit[i];
	}
  }

}
