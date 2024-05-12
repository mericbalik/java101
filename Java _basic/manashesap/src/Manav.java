import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67 , dometes = 1.11  , muz = 0.95 , patlıcan = 5.00;
        double armutal, elmaal, dometesal,muzal,patlıcanal;


        System.out.println("Armut kilonuz");
        armutal = input.nextDouble();
         double armutpara =(armutal*armut);

        System.out.println("Elma Kilonuz");
        elmaal = input.nextDouble();
        double elmapara =(elma*elmaal);

        System.out.println("Dometes kilonuz");
        dometesal = input.nextDouble();
        double dometespara =(dometes*dometesal);

        System.out.println("Muz kilomuz");
        muzal = input.nextDouble();
        double muzpara = (muz*muzal);

        System.out.println("Patlıcan Kilonuız");
        patlıcanal = input.nextDouble();
        double patlıcanpara = (patlıcan*patlıcanal);

        System.out.println("Armut Kilo Tutarımız : " + armutpara);
        System.out.println("Elma Kilo Tutarınız : " + elmapara);
        System.out.println("Dometes Kilo Tutarımız : " + dometespara);
        System.out.println("Muz kilo tutarınız : " + muzpara);
        System.out.println("Patlıcan Kilo Tutarınız : " +patlıcanpara );

        double toplam = (armutpara+elmapara+dometespara+muzpara+patlıcanpara);
        System.out.println("Toplam Alışveriş Tutarı : " + toplam );

}

}