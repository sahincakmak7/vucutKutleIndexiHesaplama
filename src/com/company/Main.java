package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kilo,boy,index;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :");
        boy = input.nextDouble();

        index = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz :"+index);







    }
}
