/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Product pr1 = new Product();
        Product pr2 = new Product("Baby", 2000);
        Product pr3 = new Product("Dog", 100, "Yellow");
        pr1.inputProduct();
        pr1.printProduct();
        pr2.printProduct();
        pr3.printProduct();
    }
    
}
class Product{
    private String name;
    private double price;
    private String color;
    private double computeVAT(){
        this.price = this.price * 1.1;
        return this.price;
    }
    public void inputProduct(){
    int count = 0;
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter color: ");
        this.color = sc.nextLine();
    do{
        try{
            do{
            System.out.print("Enter price: ");
            this.price = sc.nextDouble();
            if(this.price <= 0)
                System.out.println("Error please input again!");
            }while(this.price <= 0);
            count++;
        }
        catch(Exception ex){
            System.out.println("Error please input again!");
            sc.next();
        }
    }while(count == 0);
    }
    public void printProduct(){
        this.price = computeVAT();
        System.out.println("=======================");
        System.out.printf("Name: %s\n" , this.name);
        System.out.printf("Price: %.2f\n",this.price);
        System.out.println("Color: " + this.color);
    }
    Product(String name, double price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    Product(){
    }
    
}
