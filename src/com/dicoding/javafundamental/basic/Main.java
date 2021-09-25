package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.Gitar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();
    }
}
