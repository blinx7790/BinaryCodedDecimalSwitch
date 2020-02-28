/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryswitchstatement;

import java.util.Scanner;

/**
 *
 * @author Parks
 */
public class BinarySwitchStatement {

   //Binary converted decimal
   //take a number one digit
   //at a time and convert
   //that number to binary
    public static void main(String[] args) {
      
        System.out.println("Please enter any number to be converted to "
                + "Binary converted Decimal");
        
        
        Scanner scanner = new Scanner(System.in);
        
        //Get input from the user
        String biString = scanner.nextLine();
        int biLen = biString.length();
        int i = 0;
        
        //Grab each number one digit at a time
        //and check the case to output the binary
        //version of each number
        while(biLen > i){
             
        char biChar = biString.charAt(i);
        
        //Each case is the number input from the user
            switch(biChar){
            
            case '0':
            System.out.print("0000 ");
                break;
            case'1':
                System.out.print("0001 ");
                    break;
            case'2':
                System.out.print("0010 ");
                break;
            case'3':
                System.out.print("0011 ");
                break;
            case'4':
                System.out.print("0100 ");
                break;
            case'5':
                System.out.print("0101 ");
                break;
            case'6':
                System.out.print("0110 ");
                break;
            case'7':
                System.out.print("0111 ");
                break;
            case'8':
                System.out.print("1000 ");
                break;
            case'9':
                System.out.print("1001 ");
                break;
                     
           
        }
            
            i++;
        }
    }
    
}
