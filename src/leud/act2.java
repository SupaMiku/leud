
package leud;

import java.util.Scanner;
// short cuts
// psvm then tab short cut to make main function
// sout then tab short cut for system.out println
public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
         System.out.println("Activity 2");
        System.out.println("Guess an Even Number");
       

        while (true){
            System.out.print("Enter your guess number: ");
            int guessnumb = sc.nextInt();
        if (guessnumb % 2 == 0){
            System.out.println("Congratulation! "+guessnumb+" is an even number! ");
            break;
        }else{
            System.out.println("That's an Odd number!");
        }}
        
        sc.close();
        
        
    }}
       
           
        
        
       
        
        
        
          
        
        
        
    
   
