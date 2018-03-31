/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;
public class Ex1 {

    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = 0, number = 0;
do{
   try{
       do{
        System.out.print("Enter integer n: ");
        n = sc.nextInt();
        if(n <= 0)
            System.out.println("Please input a positive number!");
       }while(n <= 0);
    int count = 0;
    int num = 2;
    while(count != n) { 
    boolean prime = true;
    for (int i = 2; i <= Math.sqrt(num); i++) { 
        if (num % i == 0) {
            prime = false; 
            break;
        }

    }
    if (prime) {
        count++;
        System.out.printf("%d ", num);
    }
    num++;
    number++;
}
    }
   catch(Exception ex){
       System.out.println("Please input a number!");
       sc.next();
   }
}while(number == 0);
}
}
