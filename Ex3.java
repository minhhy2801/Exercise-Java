/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;
import java.util.Arrays;
public class Ex3 {
    public static void main(String[] args) {
        int n = 0, as, num3 = 0, i = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        do{
            try {
                do{
                System.out.print("Enter the length of array: ");
                n = sc.nextInt();
                if(n <= 0)
                System.out.println("Error please input again!");
                }while(n <= 0);
                int[] a = new int[n];
                do{
                try{
                for( i = 0; i < n; i++){
                    System.out.printf("Ener element %d: ", i);
                    a[i] = sc.nextInt();
                    }
                }
                    catch(Exception ex){
                        System.out.println("Error please input again!");
                        sc.next();
                    }
        } while(i < n);
        System.out.println("1. Sort and print array");
        System.out.println("2. Print min and max value in array");
        System.out.println("3. Calculate and print out average of elements divided by 3");
        do{
            try{
            do{    
        System.out.print("Your answer: ");    
        as = sc.nextInt();
        if(as == 1)
            sortAndPrint(a);
        if(as == 2)
            findMinMax(a);
        if(as == 3)
            printAverageDevidedBy3(a);
        if(as < 1 || as > 3)
            System.out.println("Error please input again!");
            } while(as < 1 || as > 3);
            num3++;
            }
         catch(Exception ex){
            System.out.println("Error please input again!");
            sc.next();
         }  
        }while(num3 == 0);   
         num2++;
            }
             catch(Exception ex){
                        System.out.println("Error please input again!");
                        sc.next();
                    }
        } while(num2 == 0);
    }
    static void sortAndPrint(int[] a){
        Arrays.sort(a);
        System.out.println("After sort: " + Arrays.toString(a));
    }
    static void findMinMax(int[] a){
        Arrays.sort(a);
        System.out.printf("Maximum number is %d\n", a[a.length - 1]);
        System.out.printf("Mnimum number is %d\n", a[0]);
    }
    static void printAverageDevidedBy3(int[] a){
        double ave = 0;
        int count = 0;
        for(int i = 0; i < a.length; i++ ){
            if(a[i] % 3 == 0){
            ave = ave + a[i];
            count++;}
        }
        if(count != 0)
        System.out.printf("Average of elements divied by 3: %.2f\n", (ave / count));
        else  System.out.println("Can't find any elements divided by 3!");
}
    
}
