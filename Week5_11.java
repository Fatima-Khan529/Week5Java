/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

public class Week5_11 {
    public static void main(String[] args){
        int n = 3; // height of the upper triangle

        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // print stars
            }
            System.out.println(); // move to next line
        }

        // lower part
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // stars
            }
            System.out.println();
            
        }
        
    }    
}
