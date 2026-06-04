/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program Pembayaraan Kartu Kredit extends Pembayaraan
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public class PembayaranKartuKredit extends Pembayaran implements CetakStruk{
    private String noKartu;
    private String namaKartu;

    public PembayaranKartuKredit(String noKartu, String namaKartu, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.noKartu = noKartu;
        this.namaKartu = namaKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    public void setNoKartu(String noKartu) {
        this.noKartu = noKartu;
    }

    public String getNamaKartu() {
        return namaKartu;
    }

    public void setNamaKartu(String namaKartu) {
        this.namaKartu = namaKartu;
    }
    
    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui Kartu Kredit");
        System.out.println("Nama Kartu : "+namaKartu);
        System.out.println("No Kartu : "+noKartu);
        System.out.println("Id Transaksi :"+idTransaksi);
        System.out.println("Jumlah Bayar : Rp. "+jumlahBayar);
    }

    @Override
    public void cetak() {
        System.out.println("--------STRUK PEMBAYARAN KARTU KREDIT-----------");
        System.out.println("ID transaksi : "+idTransaksi);
        System.out.println("Jumlah Pembayaran  :"+jumlahBayar);
        System.out.println("Nama Kartu :"+noKartu);
    }
    
}
