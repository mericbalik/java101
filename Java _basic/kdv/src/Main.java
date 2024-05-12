import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("ücret giriniz");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvOran;
        System.out.println("KDV ORANI " + kdvOran);
        System.out.println("KDVLİ ORANI " +kdvliTutar);
        System.out.println();




    }
}
