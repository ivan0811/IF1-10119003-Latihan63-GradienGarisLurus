package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: program menampilkan hasil hitung dari koordinat menggunakan konsep interface
 */

public class Main {

    public static void main(String[] args) {
	    Koordinat koordinat1, koordinat2;
        koordinat1 = new Koordinat(2, 10,5,7);
        System.out.println("Garis yang melalui titik ("+ koordinat1.getX1()+", "+ koordinat1.getY1()+") dan ("+ koordinat1.getX1() +", "+ koordinat1.getX2()+")");
	    System.out.println("memiliki gradien sebesar "+koordinat1.hitungGradien());
	    koordinat2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik ("+ koordinat2.getX1()+", "+ koordinat2.getY1()+") dan ("+ koordinat2.getX1() +", "+ koordinat2.getX2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat2.hitungGradien());
    }
}
