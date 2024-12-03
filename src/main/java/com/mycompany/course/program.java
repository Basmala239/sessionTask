/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.course;

import java.util.Scanner;

/**
 *
 * @author Basmala
 */
public class program {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        
       FindDuplicated calc= new FindDuplicated(n,a);
       calc.printDublicated();
       
    }

}
/*
String s= in.nextLine();
       s+=in.nextLine();
       in.close();

read string in java with space
*/
