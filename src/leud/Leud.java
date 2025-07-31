
package leud;

import java.util.Scanner;

public class Leud {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter name: ");
        String name  = sc.nextLine();
        System.out.print("Enter marks in Science: ");
        int scie = sc.nextInt();
        System.out.print("Enter marks in History: ");
         int hist = sc.nextInt();
        System.out.print("Enter marks in Math: ");
         int math = sc.nextInt();
        System.out.print("Enter marks in Soc: ");
         int soc = sc.nextInt();
        System.out.print("Enter marks in Arts: ");
         int art = sc.nextInt();
         
         int total = scie + hist+ math+ soc+ art;
         float percentage = (float) (total / 5.0);
         
         String remarks;
         
        if(percentage < 70){
        remarks = "Fail";
        
        }else if( percentage <= 75) {
            remarks = "Poor";
            }else if (percentage <= 80){
                remarks = "Fair";
            }else if (percentage <= 85){
                remarks = "Good";
            }else if (percentage <= 90){
                remarks = "Very Good";
            }else{
                remarks = "Execellent";
            }
        System.out.println("Total Marks: "+ total);
        System.out.println("Total Percentage: "+percentage);
        System.out.println("Remarks: "+remarks);
       
        
        if (percentage < 70 ){
            System.out.println(name+" You Failed try again!");
        }else{
            System.out.println("Congrats "+name+" you Passed!");
        }
        
        
    
    
    
    
    
    }
        
    
    
    
    
    
}
