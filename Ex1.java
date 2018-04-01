//Nhấp Ctrl + Shift + F để clean code

package ex1;

import java.util.Scanner;
public class Ex1 {

    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = 0, number = 0; //biến này để là gì không hiểu
do{
   try{
       do{
        System.out.print("Enter integer n: ");
        n = sc.nextInt();
        if(n <= 0)
            System.out.println("Please input a positive number!");
       }while(n <= 0);
    int count = 0; // hạn chế khai báo biến trong vòng lặp
    int num = 2;    // _____ nt ______
    while(count != n) { 
    boolean prime = true;   //______ nt ________
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
    num++; //không hiểu
    number++; //
}
    }
   catch(Exception ex){
       System.out.println("Please input a number!");
       sc.next(); //không hiểu
   }
}while(number == 0);
}
}
