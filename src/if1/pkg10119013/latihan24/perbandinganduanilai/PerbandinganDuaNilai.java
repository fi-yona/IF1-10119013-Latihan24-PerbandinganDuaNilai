/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan24.perbandinganduanilai;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;

public class PerbandinganDuaNilai {
    
    static Scanner scan = new Scanner(System.in);
    
    int nilaiPertama;
    int nilaiKedua;
    
    public void inputNilaiPertama(){
        System.out.print("Masukkan nilai pertama\t: ");
        nilaiPertama = scan.nextInt();
    }
    
    public void inputNilaiKedua(){
        System.out.print("Masukkan nilai kedua\t: ");
        nilaiKedua = scan.nextInt();
    }
    
    public void hasilBanding(){
        String hasil;
        if(nilaiPertama < nilaiKedua){
            System.out.println("Hasil : " + nilaiPertama + " lebih kecil dari " + nilaiKedua);
        }else if(nilaiPertama > nilaiKedua){
            System.out.println("Hasil : " + nilaiPertama + " lebih besar dari " + nilaiKedua);
        }else{
            System.out.println("Hasil : " + nilaiPertama + " sama dengan " + nilaiKedua);
        }
    }
    
    public void ulangAktivitas(){
        System.out.println();
        System.out.print("Ulangi aktiivitas? (ya/tidak) : ");
        if(scan.next().equals("ya")){
            System.out.print("\n");
            isi();
        }
    }
    
    public void isi(){
        inputNilaiPertama();
        inputNilaiKedua();
        hasilBanding();
        ulangAktivitas();
    }
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("========Program Perbandingan Nilai========");
        
        PerbandinganDuaNilai nilai = new PerbandinganDuaNilai();
        
        nilai.isi();
        
        System.out.println("==========================================");
    }
    
}
