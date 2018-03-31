/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Thanh
 */
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
    int n, i = 1, count = 0;
    boolean test = true;
    Scanner sc = new Scanner(System.in);
    do{
        try{
            do{
            System.out.print("Enter n: ");
            n = sc.nextInt();
            if(n < 0)
            System.out.println("Error please input again!");
            } while(n < 0);
            System.out.printf("Multiplication table of %d:\n",n);
            while(i <= 10){
                String s = String.format("%d\tx\t%d\t=\t%d\n", n, i, n * i);
                System.out.println(s);
                i++;
            }
            count++;
        }
        catch(Exception ex){
            System.out.println("Error please input again!");
            sc.next();
        }
} while(count == 0);
       }
}
