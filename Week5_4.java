/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
public class Week5_4 {
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double n=sc.nextDouble();
        double sum=0;
        
        for(double i=1; i<=n; i++){
            sum=sum+(1/i);
        }
        System.out.println(sum);
            
    }
    
}
