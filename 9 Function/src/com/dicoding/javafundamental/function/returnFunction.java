package com.dicoding.javafundamental.function;

public class returnFunction {
    public static void main(String[] args){
        double p = 7;
        double l = 6.5;
        double hasil = hitunganLuas(p, l); //memanggil fungsi
        System.out.println("Hasilnya adalah " + hasil);
    }

    //fungsi nilai balik
    public static double hitunganLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        return  luas;
    }
}
