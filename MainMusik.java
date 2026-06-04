/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum04062026;

/**
 *
 * @author Echa2
 */
public class MainMusik {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gitar gitar = new Gitar(6,"Gitar Klasik","Petik");
        Keyboard keyboard = new Keyboard(true,"Yamaha PSR","Elektronik");
        
        System.out.println("--------------info Gitar-------------");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("-------------info Keyboard-------------");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
}
