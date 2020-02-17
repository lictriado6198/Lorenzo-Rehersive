/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lorenzo.rehersive;

/**
 *
 * @author PC
 */
public class LorenzoRehersive {

   static int n1=78,n2=36,n3=99;      
     static void printFibo(int count){      
        if(count>0){      
             n3 = n1 + n2;      
             n1 = n2;      
             n2 = n3;      
             System.out.print(" "+n3);     
             printFibo(count-1);      
         }      
     }        
  
public static void main(String[] args) {  
    int count=15;      
      System.out.print(n1+" "+n2);      
      printFibo(count-2);   
}  
}  
    
   
    