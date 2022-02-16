/*
* File: Osztasegesz.java
* Author: Balogh Csenge
* Copyright: 2022, Balogh Csenge
* Group: Szoft_I_N
* Date: 2022-02-16
* Github: https://github.com/csengekulker/
* Licenc: GNU GPL
*/

import java.util.Scanner;

class Osztasegesz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Balogh Csenge, Szoft_I_N, 2022.02.16");
        System.out.println("Osztas hanyadosa, maradeka");

        System.out.print("Szamlalo (osztando) > ");
        int numer = sc.nextInt();
        System.out.print("Nevezo (oszto) > ");
        int denom = sc.nextInt();

        sc.close();

        int remainder = numer % denom;

        if (remainder != 0) {
            System.out.println("Az osztas maradeka " + remainder);
        } 

        System.out.println("Az osztas eredmenye " + numer / denom);

    }
}