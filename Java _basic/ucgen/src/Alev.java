
//Java da dik üçgen hesaplama


import java.util.Scanner;

public class Alev {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b;
        System.out.println("1.kenarı giribiz ");
        a = input.nextInt();

        System.out.println("2.kenarı giribiz ");
        b = input.nextInt();

        int ucgen_a = (a*a) , ucgen_b = (b*b);
        int ucgen_toplam = (ucgen_a + ucgen_b);



        System.out.println("3. Kenar Değeri : " + Math.sqrt(ucgen_toplam));







    }
}
