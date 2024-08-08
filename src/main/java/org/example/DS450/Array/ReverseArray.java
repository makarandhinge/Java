package org.example.DS450.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] no = {2, -9, 0, 5, 12, -25, 22, 9, 8,12};
        int temp;
        int i=0,j=no.length - 1;
        while(i < no.length/2){
            temp = no[i];
            no[i] = no[j];
            no[j] = temp;
            i++;
            j--;
        }
        for(int m : no){
            System.out.print(m + " ");
        }
    }
}
