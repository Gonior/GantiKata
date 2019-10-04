/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan28.gantikata;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Mengganti kata dengan manipulasi string
 */
public class PBO11K10118901Latihan28GantiKata {
    
    public static void main(String[] args) {
        String kalimat, ganti, jadi, revisi;
        Scanner input = new Scanner(System.in);
        System.out.println("=======Program Mengganti Kata==========");
        System.out.println("");
        System.out.print("Masukan kalimat : ");
        kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        ganti = input.nextLine();
        System.out.print("Menjadi Kata : ");
        jadi = input.next();
        revisi = kalimat.replaceAll(ganti,jadi);
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.println("Kalimat awal : "+ kalimat);
        System.out.println("Kalimat baru : "+ revisi);
                
        
    }
    
}
