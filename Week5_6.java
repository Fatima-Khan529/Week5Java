/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
public class Week5_6 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();
        
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        System.out.println("Factorial of a "+n+" = "+f);
    }
    
}
