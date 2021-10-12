package com.dicoding.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main(String[] args){
        int nilaiUjian = 80;
        char indeksPrestasi;

        if(nilaiUjian >= 90){
            indeksPrestasi = 'A';
        } else if (nilaiUjian >= 80){
            indeksPrestasi = 'B';
        } else {
            indeksPrestasi = 'C';
        }

        System.out.println("Nilai ujian adalah = " + indeksPrestasi);
    }
}
