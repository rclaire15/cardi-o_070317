/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cardiño_070317;

/**
 *
 * @author 3rd Year Account
 */
public class AbstractDemo {
    public static void main(String[]args) {
        FlyingSuperHero fsh = new FlyingSuperHero();
        //fsh.displayPower();
        Spiderman sp = new Spiderman();
        //sp.displayPower();
        fsh.setSuperPower("New Power", 2);
        fsh.printSuperPowers();
    }
    
}
