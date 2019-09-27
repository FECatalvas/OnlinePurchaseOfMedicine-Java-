package onlinepurchaseofmedicine;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        User active_user = null;
        Feature feat = new Feature();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tWELCOME TO RED PHARMACY\n\nPlease register first before you order!\n");
        System.out.print("Press 0 to Exit \nPress 1 to login\nPress 2 to register:\nEnter Choice: ");
        int choice = scanner.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    active_user = feat.loginMenu();

                    if (active_user != null) {
                        choice = 0;
                        break;
                    } else {
                        System.out.println("Account not found\nPlease try again!");
                        break;
                    }
                case 2:
                    feat.registerMenu();
                    choice = 1;
                    continue;
                default:
                    System.out.println("Invalid Input!!!");
                    continue;
            }
        }

//        2nd Menu 
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("\n\t\tDASHBOARD\nPress 0 to Exit \nPress 1 to Search Medicine\nPress 2 to Order Medicine\nEnter Choice: ");
        int choice1 = scanner1.nextInt();
        
        while (choice1 != 0) {
            Inventory i = new Inventory();     
            switch (choice1) {
                case 1:
                    System.out.println("\nWhat type of Medicine do you want to find?"
                + "\nPress 0 to exit\nPress 1 for Cough\nPress 2 for Headache"
                + "\nPress 3 for Allergy\nPress 4 for Body Pain\nEnter Choice:");
                  
                case 2:
                    System.out.println("\nWhat type of Medicine do you want to order?"
                + "\nPress 0 to exit\nPress 1 Search for Cough\nPress 2 Search for Headache"
                + "\nPress 3 Search for Allergy\nPress 4 Search for Body Pain\nEnter Choice:");
                   }
            
                break;
    }
}
}
