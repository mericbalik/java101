//Taksimetre Programı

//Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
//
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.

import java.util.Scanner;
public class Taksi {
    public static void main(String[] args) {

        int km, startMoney = 10;
        double perKm = 2.20, total;

        System.out.print("Kaç Km gideceğinizi girin : ");
        Scanner input = new Scanner(System.in);

        km = input.nextInt();

        total = (km * perKm) + startMoney;

        total = (total < 20) ? 20 : total;

        System.out.print("Ödeyeceğiniz Ücret : " + total);


    }
}
