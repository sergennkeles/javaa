package intro;

public class Main {

	public static void main(String[] args) {
	
		String internetSubeBtn="Dolar";
		double dolarDun=8.20;
		double dolarBugun=8.20;
		int vade=36;
		boolean isDown=true;
		System.out.println(internetSubeBtn);
		
		if(dolarBugun<dolarDun)
		{
			System.out.println("Dolar D��t� Resmi");
		}else if(dolarBugun==dolarDun)
		{
			System.out.println("De�i�im yok");
		}
		else
		{
			System.out.println("Dolar Y�kseldi Resmi");
		}
		
		String[] krediler= {"�ift�i Kredisi","Konut Kredisi","H�zl� Kredi","Meb Kredisi"};
		
		for (var kredi : krediler) {
			System.out.println(kredi);
		}
		//referans ve de�er tipler �rne�i
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		
		System.out.println("Sayi1'in de�eri: "+ sayi1);
		
		int[] sayilar1= {1,2,3,4};
		int[] sayilar2= {10,20,30,40};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println("Sayilar1[0]'in de�eri: "+sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="�zmir";
		
		System.out.println("sehir1'in de�eri: "+ sehir1);

	}

}
