/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum04062026;

/**
 *
 * @author Echa2
 */
public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(int jumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }
   
    @Override
    public void mainkan() {
        System.out.println(nama+ "dipetik dengan +"+jumlahSenar+" senar.");
    }

    @Override
    public void stem() {
        System.out.println(nama+ "menyetem gitar +"+nama+" secara manual");     
    }
    
    public int getJumlahSenar(){
        return jumlahSenar;
    }
    
    
    
}
