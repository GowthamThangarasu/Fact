/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factpro;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class Factpro {

    public static void main(String[] args){  
  int i,fact=1;  
  Scanner sc=new Scanner(System.in);System.out.println("Enter the NO.");
  int n=sc.nextInt();
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+n+" is: "+fact);    
 }  
}  
 
    
    

