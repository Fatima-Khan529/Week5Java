/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
public class Week5_5 {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        
        for(int i=0; i<=n; i++){
            int r=n%10;
            n=n/10;
            sum=sum+r;
        }
        System.out.println("The sum of the digits of the given interger is is "+sum);
    }
    
}
