package abstractClasses;

public abstract class GameCalculator {

	// Abstract olan methodlar
	// absract class'� miras alan classlarda override edilebilir. Ama absract olarak i�aretlenmeyen methodlar 
	// miras alan classlarda override edilemezler (final keyword� sayesinde).
	// Yani abstract class'� miras alan classlarda ortak olarak �al��acak
	// method varsa (�rn. a�a��daki gameOver methodu) normal method olarak tan�mlan�r. E�er abstract class'� miras
	// alan classlarda kendilerine �zg� i�lemler yapan methodlar olacaksa abstract class da tan�mlanan method
	// abstract olarak i�aretlenmelidir (�rn. a�a��daki calculate methodu)
	// NOT: abstract classlar newlenemez! ve bir abstract classda abstract method olmak zorunda de�il.
	
	public abstract void calculate();
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
