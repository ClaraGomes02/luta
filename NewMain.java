/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author clara
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lutador L1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        
        Lutador L2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        
        Lutador L3 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        Lutador L4 = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        
        Lutador L5 = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        
        Lutador L6 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
        L1.status();
        
    }
    
}
