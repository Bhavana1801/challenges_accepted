/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamprakash
 */
import  java.util.*;
import java.io.*;
public class BubbleSort {
    static void BSort(int[] a,int size){
        int temp = 0;
        boolean isSorted = true;
                 for(int i = 0;i < size;i++){
                 for(int j = 1;j < size-i;j++){
                     if(a[j]<a[j-1]){
                         isSorted = false;
                         temp = a[j-1];
                         a[j-1] = a[j];
                         a[j] = temp;
                     }   
                     if(isSorted){
                         System.out.println("Already Sorted");
                         break;
                 }
                     
                 }
                 }
                 print(a,size);
    }
    static void print(int[] array,int size){
        System.out.println("print the array");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String args[]){
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the size");
           int size = scan.nextInt();
           int[] array = new int[size];
           
           System.out.println("enter in the array");
           for(int i = 0;i<size;i++){
               array[i] = scan.nextInt();
           }
                BSort(array,size);
    }
    
    
}
