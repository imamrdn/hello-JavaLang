package com.dicoding.javafundamental.array;

public class loopingArray {
    public static void main(String[] args){
        int[] arrInt = new int[10];

        //Inisiasi dan menampilkan arrInt ke element 1 sampai 10
        for (int x = 0; x <arrInt.length; x++){
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }

}
