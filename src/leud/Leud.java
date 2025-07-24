
package leud;

import java.util.Scanner;

public class Leud {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name;
        int age;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        System.out.println("\nHello "+name+" Your age is " +age);
        
        if(age >= 18){
            System.out.println("Votable");
        }else{
            System.out.println("Minority");
        }
      
       
        
         
    }
    
}
