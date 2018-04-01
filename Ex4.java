/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.print("Enter number of student: ");
        n = sc.nextInt();
        String[] name = new String[n]; 
        double[] mark = new double[n];
        for(i = 0; i < n; i++){
        System.out.printf("Enter name of student %d: ", i + 1);
        name[i] = sc.next();
        }
        System.out.println("----------------------------------");
        do{
            try{
        for(i = 0; i < n; i++){
        do{
        System.out.printf("Enter mark of student %s: ", name[i]);
        mark[i] = sc.nextDouble();
        if(mark[i] < 0 || mark[i] > 10)
                System.out.println("Error please input again!");
        } while(mark[i] < 0 || mark[i] > 10);
        }
        printTable(mark, name);
            }
            catch(Exception ex){
                System.out.println("Please input a number!");
                sc.next();
            }
        }while(i < n);
    }
    static void printTable(double[] mark, String[] name){
        System.out.println("_________________________________________");
        System.out.println("Name\t|\tMark\t|\tEducation");
        System.out.println("_________________________________________");
        String [] edu = new String[mark.length];
        for(int i = 0; i < mark.length; i++){
            if(mark[i] < 5)
                edu[i] = "Bad";
            if(mark[i] < 6.5 && 5 <= mark[i])
                edu[i] = "Normal";
            if(mark[i] < 7.5 && 6.5 <= mark[i])
                edu[i] = "Rather";
            if(mark[i] < 9 && 7.5 <= mark[i])
                edu[i] = "Good";
            if(mark[i] >= 9) 
                edu[i] = "Excellent";  
            String s = String.format("%s\t|\t%.2f\t|\t%s", name[i], mark[i], edu[i]);
            System.out.println(s);
        }
        
    }
}
