/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.Scanner;
public class Ex6 {

    public static void main(String[] args) {
       Dog dog1 = new Dog("Bob", 1.3);
       dog1.setColor("Blue");
       dog1.info();
       Dog dog2 = new Dog("Mie", "Red", 1.2);
       dog2.info();
       Dog dog3 = new Dog();
       dog3.getName();
       dog3.getColor();
       dog3.setHeight(7);
       dog3.info();      
    }
}
class Dog{
    Scanner sc = new Scanner(System.in);
    private String name;
    private String color;
    private double height;
    public void info(){
        System.out.println("Dog information: ");
        System.out.println("=======================");
        System.out.printf("Name: %s\n" , this.name);
        if(this.height <=  0)
            System.out.println("Plese exit and input a positive number!");
        else{        
        System.out.printf("Height: %.2f\n",this.height);
        System.out.println("Color: " + this.color);
        System.out.println("-----------------------");
        }
    }
    public void getName(){
        System.out.print("Enter name of dog: ");
        this.name = sc.nextLine();
    }
    public void getColor(){
        System.out.print("Enter color: ");
        this.color = sc.nextLine();
    }
    public void setHeight(double height){
        this.height = height;
        if(this.height <= 0)
            System.out.println("Plese exit and input a positive number!");
    }
    public void setColor(String color){
        this.color = color;
    }
   Dog(String name, String color, double height){
       this.name = name;
       this.color = color;
       this.height = height;
   } 
   Dog(String name, double height){
       this.name = name;
       this.height = height;
   }
   Dog(){
       
   }
}