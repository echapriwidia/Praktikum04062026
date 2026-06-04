/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum04062026;

/**
 *
 * @author Echa2
 */
public class Keyboard extends AlatMusik implements Bisadinyalakan{
    private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+ "dimainkan dengan menekan dengan tuts.");
        
    }

    @Override
    public void stem() {
        System.out.println("Keyboard"+nama+" distem digital dengan aplikasi");
       
    }

    @Override
    public void nyalakan() {
        if (ceklistrik()){
            System.out.println(nama+ "dinyalakan.");
        }
        else{
            System.out.println(nama+ "tidak bisa nyala karena tidak ada daya.");
        }        
    }

    @Override
    public void matikan() {
        System.out.println(nama+ "dimatikan.");
        
    }

    @Override
    public boolean ceklistrik() {
        return dayaTersambung;
        
    }
    
    
    
}
