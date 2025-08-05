
package quintana;

import java.util.Scanner;


public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== QUINTANA'S BANK ===");
        System.out.println("Choose a service below:");
        System.out.println("1. Access Bank");
        System.out.println("2. Doctor's Schedule Appointment ");
        System.out.println("3. Shopping Items");

        System.out.print("Enter your selection: ");
       
        
        int selection = sc.nextInt();

        switch (selection) {
            case 1:
                quintana bankModule = new quintana();
                bankModule.loginToBank(sc);
                break;

            case 2:
                System.out.println("\n[Doctor Visit] Scheduling not available right now.");
                break;

            case 3:
                System.out.println("\n[Shopping] Feature will be added soon!");
                break;

            default:
                System.out.println("\nInvalid choice. Please restart and try again.");
        }

        sc.close();
    }
}
        
    
    
    
    

