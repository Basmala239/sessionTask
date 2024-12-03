/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

/**
 *
 * @author Basmala
 */
public class calculation {
    private int n;
    private int []a;
    
    public void setArrSize(int n){
        this.n=n;
        a=new int[n];
    }
    
    public int getArrSize(){
        return n;
    }
    public void setArrValues(int ind,int value){
        a[ind]=value;
    }
    
    public int getArrValue(int ind){
        return a[ind];
    }
    
    
}
