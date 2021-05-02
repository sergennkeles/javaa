package abstractClasses;


public class Main {

	public static void main(String[] args) {
		KidsGameCalculator kids=new KidsGameCalculator();
		kids.calculate();
		ManGameCalculator manGameCalculator= new ManGameCalculator();
		manGameCalculator.calculate();
		kids.gameOver();

		
	}

}
