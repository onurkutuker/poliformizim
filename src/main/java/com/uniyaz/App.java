package com.uniyaz;
import java.util.Scanner;

public class App
{
    private static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);

        int kenarAl1 = scan.nextInt();
        int kenarAl2 = scan.nextInt();

        Sekil kare1  = new Kare(kenarAl1);
        Sekil ucgen1 = new Ucgen(kenarAl1,kenarAl2);


        System.out.println("Kare alan : " + kare1.alanHesapla());
        System.out.println("Ucgen alan: " + ucgen1.alanHesapla());

    }

}
