/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
public class Week5_9 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        int r=0;
        int c=n;
        
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(r==c)
            System.out.println("palindrome");
        else
            System.out.println("Not Palindrome");
        
    }
    
}
