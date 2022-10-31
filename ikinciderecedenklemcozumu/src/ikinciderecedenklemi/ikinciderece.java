package ikinciderecedenklemi;

import java.util.Scanner;


public class ikinciderece {
	static int BirSayiGir()
	{
		Scanner oku = new Scanner (System.in);//Scanner sinifinin oku nesnesini olusturma 
		System.out.println("Bir tam sayı gir :");
		
		return oku.nextInt();
	}

	public static void main(String[] args) {
		//ikinci derece denklemin katsayilarni elrandan okutma :
		int a =BirSayiGir();
		if(a==0)
		{
			System.out.println("Sifira bolme var! Yeniden dene");
			System.exit(0);
		}
		int b = BirSayiGir();
		int c = BirSayiGir();
		int disk = b*b-4*a*c;
		System.out.println("disk :" +disk);
		if(disk < 0)
		{
			System.out.println("Gercek kok yok!Yeniden dene");
			System.exit(0);
		}
		else
		{
			int payda=2*a;
			double x1 =(-b +Math.sqrt(disk) ) /payda;
			System.out.println("x1:" +x1 );
			double x2 = (-b -Math.sqrt(disk) )/payda;
			System.out.println("x2 :"+x2) ;
		}

	}

}
