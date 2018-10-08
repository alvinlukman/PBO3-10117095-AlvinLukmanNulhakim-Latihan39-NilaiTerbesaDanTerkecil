
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama             : Alvin Lukman Nulhakim
 * Nim              : 10117095
 * Kelas            : IF-3
 * Deskripsi        : Menentukan Nilai Terbesar Dan Terkecil
 */
public class NilaiTerbesaDanTerkecil {

    
    public static void main(String[] args) {
        
        Petugas ptg = new Petugas();
        Mahasiswa dafNilai = new Mahasiswa();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptg.inputPetugas();
        dafNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
        System.out.println("Nilai Terkecil adalah "+dafNilai.nKecil);

        System.out.print("\nPetugas : "+ptg.namaPetugas);
    }
    
}
