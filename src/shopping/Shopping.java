/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author saliy5109
 */
import java.util.Scanner;

public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Shopping
        final double TAX_RATE = 1.12;
        final double STORAGE_COST = 19.99;
        final double KEYBOARD_COST = 49.99;
        final double MOUSE_COST  = 25.99;
        int numStorage;
        int numKeyboard;
        int numMouse;
        double subTotal;
        double tax;
        double grandTotal;
        
        System.out.println("How mnay USB sorage devices would you like to buy?");
        numStorage = input.nextInt();
        System.out.println("How many keyboards would you like to buy?");
        numKeyboard = input.nextInt();
        System.out.println("How many computer mouses would you like to buy?");
        numMouse = input.nextInt();
        
        subTotal = (STORAGE_COST*numStorage) + (KEYBOARD_COST*numKeyboard) + (MOUSE_COST*numMouse);
        grandTotal = TAX_RATE*subTotal;
        tax = grandTotal-subTotal;
        
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Taxs: " + tax);
        System.out.println("Total: " + grandTotal);
        
    }
    
}
