package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double weight,height,index;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz :");
        weight = input.nextDouble();

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz :");
        height = input.nextDouble();

        index = weight / (height*height);
        System.out.println("Vücut kitle indeksiniz :"+index);







    }
}
