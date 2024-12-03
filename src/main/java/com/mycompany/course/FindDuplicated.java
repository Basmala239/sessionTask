/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

/**
 *
 * @author Basmala
 */
public class FindDuplicated extends calculation{
    
    public FindDuplicated(int n,int []a){
        setArrSize(n);
        for(int i=0;i<n;i++)
            setArrValues(i,a[i]);
    }
    
    public void printDublicated(){
        int frq[]=new int [100];
        for(int i=0;i<getArrSize();i++){
            frq[getArrValue(i)]++;
        }
        boolean dup=false;
        for(int i=0;i<100;i++){
            if(frq[i]>1){
                dup=true;
                System.out.print(i+" ");
            }
        }
        if(dup){
            System.out.println();
        }else{
            System.out.println("no duplicated element");
        }
    }
    
            
}
