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
			System.out.println("Dolar Düþtü Resmi");
		}else if(dolarBugun==dolarDun)
		{
			System.out.println("Deðiþim yok");
		}
		else
		{
			System.out.println("Dolar Yükseldi Resmi");
		}
		
		String[] krediler= {"Çiftçi Kredisi","Konut Kredisi","Hýzlý Kredi","Meb Kredisi"};
		
		for (var kredi : krediler) {
			System.out.println(kredi);
		}
		//referans ve deðer tipler örneði
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		
		System.out.println("Sayi1'in deðeri: "+ sayi1);
		
		int[] sayilar1= {1,2,3,4};
		int[] sayilar2= {10,20,30,40};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println("Sayilar1[0]'in deðeri: "+sayilar1[0]);
		
		String sehir1="Ankara";
		String sehir2="Ýstanbul";
		sehir1=sehir2;
		sehir2="Ýzmir";
		
		System.out.println("sehir1'in deðeri: "+ sehir1);

	}

}
