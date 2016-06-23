
import java.io.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamprakash
 */
public class SelectionSort {
    static void SSort(int[] array,int size){
        int MinIndex = 0;
        for(int i=0;i<size;i++){
            MinIndex = i;
           for(int j=i+1;j<size;j++){
                  
                  if(array[j]<array[MinIndex]){
                      MinIndex = j;
                  }
          }
           if(MinIndex!=i){
           int temp = array[i];
              array[i] = array[MinIndex];
              array[MinIndex] = temp;
           }
        }
         print(array,size);
        
    }
    static void print(int[] array,int size){
        System.out.println("print the array");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           System.out.println("Enter the size");
           int size = scan.nextInt();
           int[] array = new int[size];
           
           System.out.println("enter in the array");
           for(int i = 0;i<size;i++){
               array[i] = scan.nextInt();
           }
                SSort(array,size);
    }
         
}
