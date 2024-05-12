// BMI Calculator

import java.util.Scanner;
public class Endeks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double boy,kilo,endeks;

        System.out.println("Tall Enter : ");
        boy = input.nextDouble();

        System.out.println("Kilos Enter : ");
        kilo = input.nextDouble();

        endeks = kilo / (boy*boy);
        System.out.println("BMI Calculator : " + endeks);





    }
}
