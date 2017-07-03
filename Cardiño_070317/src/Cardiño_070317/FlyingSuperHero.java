/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cardiño_070317;

/**
 *
 * @author 3rd Year Account
 */

   public class FlyingSuperHero extends SuperHero {
       /**
        *This method will display power
        * @param 
        * This method does not have a parameter
        * @return 
        * This method does not return any value
        * @
        */
       
       @Override
    void displayPower() {
        System.out.println("Fly...");
    }
       void setSP(String superPowers[]){
           super.setSuperPowers(superPowers);
       }
   }