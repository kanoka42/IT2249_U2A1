/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a1_addmultiplythreeints;

import java.util.Scanner;

/**
 *
 * @author destr
 */
public class U2A1_AddMultiplyThreeInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Initialize the Scanner Input
        Scanner user_input = new Scanner (System.in); 
        
        // Get the first input from the user - store it to first_entry
        System.out.print("Enter the first integer: ");
        int first_entry = user_input.nextInt();
        
        // Get the second input from the user - store it to second_entry
        System.out.print("Enter the second integer: ");
        int second_entry = user_input.nextInt();
        
        // Get the third input from the user - store it to third_entry
        System.out.print("Enter the third integer: ");
        int third_entry = user_input.nextInt();
        
        // Add all of the entries to find the sum
        int sum = first_entry + second_entry + third_entry;
        
        // Multiply the entries to obtain the product. 
        int product = first_entry * second_entry * third_entry;
        
        // Print the Sum and the Product.
        System.out.println("The sum of the three integers: " + sum);
        System.out.println("The product of the three integers: " + product);
          
    }
    
}
