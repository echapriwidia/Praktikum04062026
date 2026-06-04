/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program Pembayaraan E-Wallet extends Pembayaran
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public class PembayaranEWallet extends Pembayaran implements CetakStrukbayar{
    
    private String namaEWallet;

    public PembayaranEWallet(String namaEWallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEWallet = namaEWallet;
    }

    public String getNamaEWallet() {
        return namaEWallet;
    }

    public void setNamaEWallet(String namaEWallet) {
        this.namaEWallet = namaEWallet;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui E-Wallet");
        System.out.println("Nama E-Wallet : "+namaEWallet);
        System.out.println("Id Transaksi : "+idTransaksi);
        System.out.println("Jumlah Pembayaran : "+jumlahBayar);
    }
    
    public void cetak(){
        System.out.println("--------STRUK PEMBAYARAN E-WALLET-----------");
        System.out.println("ID transaksi : "+idTransaksi);
        System.out.println("Jumlah Pembayaran  :"+jumlahBayar);
        System.out.println("Nama E-Wallet :"+namaEWallet);
                
    }
    
}
