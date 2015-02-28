/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_program1;

import java.util.Scanner;

/**
 *
 * @author jrgc9
 */
public class Assignment1_Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double product =1;
        double input =0;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter numbers to find the product of:");
      
        do
        {
            input = sc.nextDouble();

         if(input>0)
         {
             product *= input;
             //product = product * input;
         }
         
         if(input<0)
         {
            System.out.println("Number Skipped:");
         }
         
    // TODO code application logic here
        }

        while (input!=0);
    System.out.println("Total:"+product);
        // TODO code application logic here
    }
    
}
