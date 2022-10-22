import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double tutar, oran_1 = 0.08, oran_2 = 0.18, kdvlitutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücreti giriniz : ");
        tutar = input.nextDouble();

        kdvlitutar = tutar < 1000 ? (tutar * oran_2 + tutar) : (tutar * oran_1 + tutar);
        System.out.println("Kdv'siz tutar : " + tutar);
        System.out.println("1000 liraya kadar kdv oranı :" + oran_2);
        System.out.println("1000 lira ve üstü sonrası kdv tutarı : " + oran_1);
        System.out.println("Kdv Dahil tutar : " + kdvlitutar);



    }
}
