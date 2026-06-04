/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: Program abstract class Pembayaran
 */
package Praktikum21052026;

/**
 *
 * @author Echa2
 */
public abstract class Pembayaran {
    protected double jumlahBayar;
    protected String idTransaksi;
    
    public Pembayaran() {
        
    }

    public Pembayaran(double jumlahBayar, String idTransaksi) {
        this.jumlahBayar = jumlahBayar;
        this.idTransaksi = idTransaksi;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }
    
    //konsep polymorphism
    //abstract method
    public abstract void prosesPembayaran();
    
}
