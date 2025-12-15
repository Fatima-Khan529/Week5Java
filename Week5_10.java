/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

public class Week5_10 {
    
    public static void main(String [] args){
        int n=236;
        String s="";
        
        while(n!=0){
            int r=n%16;
            n=n/16;
            
            if(r<10)
                s=s+r;
            else if(r==10)
                s=s+"A";
            else if(r==11)
                s=s+"B";
            else if(r==12)
                s=s+"C";
            else if(r==13)
                s=s+"D";
            else if(r==14)
                s=s+"E";
            else if(r==15)
                s=s+"F";
        }
        System.out.println(s);
    }
}
