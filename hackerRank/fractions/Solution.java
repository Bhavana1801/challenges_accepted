import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        //int[] array = new int[size];
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i =0; i < size; i++) {
        	array.add(sc.nextInt());
        }
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        for(int i = 0; i < size; i++) {
        	for(int j = 1; j<=2000;j++) {
        		if(array.get(i)/j == array.get(i+1)/j) {
        			
        		}
        	}
        }
    }
}