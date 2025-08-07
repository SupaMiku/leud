
package quintana;

import java.util.Scanner;

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO QUINTANA'S SYSTEM!");
        System.out.println("How are you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        quintana bApp[] = new quintana[10];
        int accountCount = 0;

        System.out.print("Select an option: ");
        int choice = sc.nextInt();
        int resp;

        switch (choice) {
            case 1:
                do {
                    System.out.println("1. Register Account");
                    System.out.println("2. Login Account");
                    System.out.println("3. View All Accounts");
                    System.out.print("Enter Selection: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            if (accountCount < bApp.length) {
                                bApp[accountCount] = new quintana();
                                System.out.print("Enter Account No.: ");
                                bApp[accountCount].setAccountNo(sc.nextInt());
                                System.out.print("Enter Account Pin: ");
                                bApp[accountCount].setPin(sc.nextInt());
                                System.out.println("Account Registered!");
                                accountCount++;
                            } else {
                                System.out.println("Account storage full.");
                            }
                            break;

                        case 2:
                            int attempts = 3;
                            boolean loggedIn = false;

                            System.out.print("Enter your Account No: ");
                            int accountNo = sc.nextInt();
                            System.out.print("Enter your Pin: ");
                            int pin = sc.nextInt();

                            while (attempts > 0 && !loggedIn) {
                                for (int i = 0; i < accountCount; i++) {
                                    if (bApp[i] != null && bApp[i].verifyAccount(accountNo, pin)) {
                                        System.out.println("LOGIN SUCCESSFUL!");
                                        loggedIn = true;
                                        break;
                                    }
                                }

                                if (!loggedIn) {
                                    attempts--;
                                    if (attempts == 0) {
                                        System.out.println("ATTEMPT LIMIT REACHED!");
                                        System.exit(0);
                                    }

                                    System.out.println("Attempt Left: " + attempts);
                                    System.out.println("INVALID ACCOUNT!");
                                    System.out.print("Enter your Account No: ");
                                    accountNo = sc.nextInt();
                                    System.out.print("Enter your Pin: ");
                                    pin = sc.nextInt();
                                }
                            }
                            break;

                        case 3:
                            System.out.println("Registered Accounts:");
                            for (int i = 0; i < accountCount; i++) {
                                if (bApp[i] != null) {
                                    System.out.println("Account No: " + bApp[i].getAccountNo());
                                }
                            }
                            break;
                    }

                    System.out.print("Do you want to continue? (1/0): ");
                    resp = sc.nextInt();
                } while (resp == 1);
                break;

            case 2:
                System.out.println("Incoming soon!");
                break;

            case 3:
                System.out.println("Incoming soon!");
                
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
}

        
    
    
    
    

