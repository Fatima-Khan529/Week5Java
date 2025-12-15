/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
public class Week5_8 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        
        String s="";
        while(n!=0){
            int r=n%10;
            n=n/10;
            s=s+r;
        }
        System.out.println("The  reverse the digits of a integer = "+s);
    }
    
}
