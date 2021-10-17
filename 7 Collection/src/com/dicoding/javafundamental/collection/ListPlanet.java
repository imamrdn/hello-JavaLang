package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet{
    public static void main(String[] args){
        //deklarasi awal
        String[] heroes = new String[2];

        heroes[0] = "rizki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; error ArrayIndexOfBoundsException karena ukuran array tetap

        //menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add( untuk menambahkan objek ke list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); //objek lainnya masih bisa ditambahkan ke list

        System.out.println("List Planet awal: ");
        for (int i=0; i<planets.size(); i++){ // method size() untuk mendapatkan ukuran list
            //method get() untuk melihat isi List pada index i
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }

        planets.remove("venus"); // method untuk mengeluarkan  objek dari List

        System.out.println("List planets akhir ");
        for (int i=0; i<planets.size(); i++){
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }

}
