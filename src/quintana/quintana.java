
package quintana;

import java.util.Scanner;


public class quintana {
    private final int clientNumber = 999111;
    private final int secretKey = 12345;
    

    public void loginToBank(Scanner reader) {
        int failedTries = 0;
        boolean isAllowed = false;

        System.out.println("\n--- Login Portal: Quintana's Bank ---");

        while (failedTries < 3 && !isAllowed) {
            System.out.print("Enter Client Number: ");
            int inputClient = reader.nextInt();

            System.out.print("Enter Secret Key: ");
            int inputKey = reader.nextInt();

            if (inputClient == clientNumber && inputKey == secretKey) {
                System.out.println("\n[Welcome!] You have successfully logged in to Quintana's Bank.");
                isAllowed = true;
                break;
                
            } else {
                failedTries++;
                System.out.println("Incorrect details. Try " + failedTries + " of 3.");
            }
        }

        if (!isAllowed) {
            System.out.println("\nToo many failed attempts. Banking service is now locked.");
        }
    }
}
    
