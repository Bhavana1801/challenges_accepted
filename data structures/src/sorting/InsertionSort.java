
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
public class InsertionSort {
     static void ISort(int[] array,int size){
       
         for(int i=1;i<size;i++){
                     for(int j=i;j>0;j--){
                         if(array[j]<array[j-1]){
                             int temp = array[j-1];
                             array[j-1] = array[j];
                             array[j] = temp;
                         }
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
                ISort(array,size);
    }
}
