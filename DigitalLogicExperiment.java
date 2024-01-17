/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.digitallogicexperiment;

/**
 *
 * @author suha9
 */
public class DigitalLogicExperiment {
    public static void main(String[] args) {
    boolean[] x ={true, false, true, false, false, false, false, true};
     int i=0;
       for(i=x.length-1;i>=0;i--)
           if(x[i]==true)  System.out.print(1);  else  System.out.print(0);
       System.out.println();
        int decimal=0;
       for(i=0;i<x.length;i++)
       if(x[i]==true)
           decimal+=Math.pow(2,i);
       System.out.println("Decimal equivalent is= "+decimal);
       decimal=113;
       i=0;
       while(decimal>0){
           if(decimal%2==1)
               x[i]=true;
           else
               x[i]=false;
           decimal=decimal/2;
           i++;
       }
       for(i=x.length-1;i>=0;i--)
           if(x[i]==true) System.out.print(1);   else System.out.print(0);
       System.out.println();
       }
       
       }
    

    



