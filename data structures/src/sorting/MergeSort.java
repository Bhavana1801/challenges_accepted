/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iamprakash
 */
//public class MergeSort {
//    int[] array;
//    MergeSort(){
//       array = new int[12,5,3,8,14,32,19,4];
//    }
//    public static void main(String[] args) {
//        int[] array = {12,5,3,8,14,32,19,4};
//        int low = 0;
//        int high = array.length;
//        Mergesort(array,low,high);
//    }
//    public static void Mergesort(int[] array,int low,int high){
//        if(low<high){
//            int mid = low+high/2;
//            Mergesort(array,low,mid);
//            Mergesort(array,mid+1,high);
//            MergeArray(array,low,mid,high);
//        }
//    }
//    public static void MergeArray(int[] elements,int low,int mid,int high){
//        int i,j,k,l;
//        int[] finalarray = new int[20];
//        l = low;
//        i = low;
//        j = mid+1;
//        while((l<=mid)&&(j<=high)){
//        if(elements[l]<=elements[j]){
//            finalarray[i]=elements[l];
//            l++;
//        }else{
//            finalarray[i]=elements[j];
//            j++;
//        }
//        i++;
//    }
//    if(l>mid){
//        for(k=j;k<=high;k++){
//           finalarray[i]=elements[k];
//            i++;
//        }
//    }else{
//        for(k=l;k<=mid;k++){
//           finalarray[i]=elements[k];
//            i++;
//        }
//    }
//    for(k=low;k<=high;k++){
//        elements[k]=finalarray[k];
//    }
//    }
//    public void display(){
//        System.out.println("sorted array");
//        for(int i:array)
//        System.out.print(i+" ");
//    }
//}
///*//Merge Sort
import java.io.*;
import java.util.*;
class MergeSort
{
    
    public static void main(String[] args) {
        //Initializing array
        int arr[]={9,4,8,3,1,2,5};
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        mergesort(arr,0,arr.length-1);
        
    }
    //Sorting in non decreasing order
    private static void mergesort(int[] arr, int i, int j) {
        int mid=0;
        if(i < j)
        {
            mid = (i+j)/2;
            //System.out.println("mid="+mid);
            mergesort(arr,i,mid);
            mergesort(arr,mid+1,j);
            
            merge(arr,i,mid,j); 
            
            
        }
        
    }

    private static void merge(int[] arr, int i, int mid, int j) {
        System.out.print("Left part:"+Arrays.toString(Arrays.copyOfRange(arr, i, mid+1)));
        System.out.print(" Right part:"+Arrays.toString(Arrays.copyOfRange(arr, mid+1,j+1))+"\n");
        
        
        int temp[]=new int[arr.length];
        int l = i;
        int r = j;
        int m = mid+1;
        int k = l;
        
        while(l <= mid && m <= r)
        {
            if(arr[l] <= arr[m])
            {
                temp[k++] = arr[l++];
            }
            else
            {
                temp[k++] = arr[m++];
                
                
            }
            
        }
        while(l <= mid)
            temp[k++] = arr[l++];
        while(m <= r){
            temp[k++] = arr[m++];           
        }
        
        for(int i1 = i;i1 <= j;i1++){
            arr[i1] = temp[i1];
        }
        System.out.println("After Merge:"+Arrays.toString(Arrays.copyOfRange(arr, i, j+1)));
        
        
        
    }

}


