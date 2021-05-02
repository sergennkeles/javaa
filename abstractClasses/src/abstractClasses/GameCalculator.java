package abstractClasses;

public abstract class GameCalculator {

	// Abstract olan methodlar
	// absract class'ý miras alan classlarda override edilebilir. Ama absract olarak iþaretlenmeyen methodlar 
	// miras alan classlarda override edilemezler (final keywordü sayesinde).
	// Yani abstract class'ý miras alan classlarda ortak olarak çalýþacak
	// method varsa (örn. aþaðýdaki gameOver methodu) normal method olarak tanýmlanýr. Eðer abstract class'ý miras
	// alan classlarda kendilerine özgü iþlemler yapan methodlar olacaksa abstract class da tanýmlanan method
	// abstract olarak iþaretlenmelidir (örn. aþaðýdaki calculate methodu)
	// NOT: abstract classlar newlenemez! ve bir abstract classda abstract method olmak zorunda deðil.
	
	public abstract void calculate();
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
