/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
public class Week5_77 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        System.out.println("Enter elements of array:");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        
        int largest=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        System.out.println("The largest element in a given integer array "+largest);
    }
    
}
