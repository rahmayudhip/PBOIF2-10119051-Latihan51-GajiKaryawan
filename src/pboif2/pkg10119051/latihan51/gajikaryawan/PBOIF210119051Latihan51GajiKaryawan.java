/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program GajiKaryawan
 */
public class PBOIF210119051Latihan51GajiKaryawan {

   
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in); 
    
        
        System.out.print("Masukkan NIK = ");
        manager.setNik(scn1.next());
        System.out.print("Masukkan Nama = ");
        manager.setNama(scn2.next());
        System.out.print("Masukkan Golongan (1/2/3) = ");
        manager.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) = ");
        manager.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran = ");
        manager.setKehadiran(scn5.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK = " + manager.getNik());
        System.out.println("Nama = " + manager.getNama());
        System.out.println("Golongan = " + manager.getGolongan());
        System.out.println("Jabatan = " + manager.getJabatan());
        System.out.println("");
        System.out.println("Tunjangan Golongan = " + manager.tunjanganGolongan(manager.getGolongan()));
        System.out.println("Tunjangan Jabatan = " + manager.tunjanganJabatan(manager.getJabatan()));
        System.out.println("Tunjangan Kehadiran = " + manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("Gaji Total = " + manager.totalGaji());
    }
        
}
