/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program MainPembayaraan
 */
package Praktikum21052026;

import java.util.Scanner;

/**
 *
 * @author Echa2
 */
public class MainPembayaran {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Pembayaran pembayaran = null;
        CetakStruk c = null;
        
        System.out.println("Sistem Pembayaran Toko Echa");
        System.out.println("----------------------------");
        System.out.print("Masukkan Id Transaksi:");
        String id  = input.nextLine();
        
        System.out.print("Masukkan Total Pembayaran:");
        double jumlah = input.nextDouble();
        input.nextLine();//clear buffer
        
        System.out.println("\n Pilihan Metode Pembayaran");
        System.out.println("1. Pembayaran secara tunai");
        System.out.println("2. pembayaran secara transfer");
        System.out.println("3. Pembayaan Menggunakan kartu kredit");
        System.out.println("4. Penmbayaran menggunakan E-Wallet");
        System.out.print("Pilihan aAnda(1-4):");
        int pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1: System.out.print("Inputkan jumlah uang:");
                    double uang = input.nextDouble();
                    pembayaran = new PembayaranTunai(uang,jumlah,id);
                    c = (CetakStruk)pembayaran;
                    break;
                    
            case 2: System.out.print("Masukkan nama bank:");
                    String nama = input.nextLine();
                    pembayaran = new PembayaranTransfer(nama,jumlah,id);
                      c = (CetakStruk)pembayaran;
                      break;
                   
                  
            case 3: System.out.print("Masukkan nama kartu(Mastercard,Visacard:");
                    String namaKartu = input.nextLine();
                    System.out.print("Masukkan no Kartu:");
                    String no = input.nextLine();
                    pembayaran = new PembayaranKartuKredit(no,namaKartu,jumlah,id);
                      c = (CetakStruk)pembayaran;
                      break;
                    
            case 4: System.out.print("Masukkan nama E-Wallet(Ovo,Dana,ShoopeePay):");
                    String ewallet = input.nextLine();
                    pembayaran = new PembayaranTransfer(ewallet,jumlah,id);
                      c = (CetakStruk)pembayaran;
                      break;
        }

         System.out.println("Kondirmasi pembayaran");
         pembayaran.prosesPembayaran();  
         
         System.out.println();
         c.cetak();
    }
}
