import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1, num2, secim;
		Scanner deger = new Scanner(System.in);
		System.out.print("ilk sayiyi giriniz: ");
		num1 = deger.nextInt();
		System.out.println("ikinci sayiyi giriniz: ");
		num2 = deger.nextInt();
		System.out.println("1.toplama\n2.cikarma\n3.carpma\n4.bolme ");
		System.out.println("secimi yapiniz: ");
		secim=deger.nextInt();
		switch(secim) {
		case 1: 
			System.out.print(num1+num2);
			break;
		case 2:
			System.out.print(num1-num2);
			break;
		case 3:
			System.out.print(num1*num2);
			break;
		case 4:
			if(num1!=0 && num2!=0) {
			System.out.print(num1/num2);
			}else {
				System.out.println("0 ile islem yapilamaz...");
			}
			break;
			
		}
		
	}

}
