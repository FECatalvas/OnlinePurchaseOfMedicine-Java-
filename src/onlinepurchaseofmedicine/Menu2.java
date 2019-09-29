/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchaseofmedicine;

import java.util.Scanner;

/**
 *
 * @author 2ndyrGroupB
 */
public class Menu2 {

    User active_user = null;
    Feature feat = new Feature();
    Scanner scanner = new Scanner(System.in);
    Inventory invent = new Inventory();
    Scanner scanner1 = new Scanner(System.in);

    public void firstMenu() {
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
    }

    public void secMenu() {
        Scanner Scanners = new Scanner(System.in);
        System.out.print("\n\t\t=====================DASHBOARD====================\nPress 0 to Exit \nPress 1 to Search Medicine\nPress 2 to Order Medicine\nEnter Choice: ");
        int choice1 = scanner1.nextInt();
        while (choice1 != 0) {
            Inventory i = new Inventory();
            switch (choice1) {
                case 1:
                    System.out.print("\n\tWhat type of Medicine do you want to find?\nPress 0 to exit\nPress 1 for Cough\nPress 2 for Headache\nPress 3 for Allergy\nPress 4 for Body Pain\nEnter Choice:");
                    int answer = Scanners.nextInt();
                    if (answer == 1) {
                        invent.InventoryCough();
                        secMenu();
                    } else if (answer == 2) {
                        invent.InventoryHeadache();
                        secMenu();
                    } else if (answer == 3) {
                        invent.InventoryAllergy();
                        secMenu();
                    } else if (answer == 4) {
                        invent.InventoryBodyPain();
                        secMenu();
                    } else {
                        System.out.println("Invalid Input!!!!!");
                        secMenu();
                    }
                case 2:
                    System.out.println("\nAre you a Senior Citizen?\n\tType Yes or No\nEnter choice: ");
                    String answer2 = Scanners.nextLine();
                    if (answer2.equalsIgnoreCase("Yes")) {
                        senior();
                    } else if (answer2.equalsIgnoreCase("No")) {
                        regular();
                    } else {
                        System.out.println("Invalid Input!!");

                    }
                default:
                    System.out.println("Invalid Input!!!");
                    continue;
            }

        }
    }

    public void decisionOrderCough() {
        Scanner Scanners = new Scanner(System.in);
        System.out.print("Enter brand name: ");
        String answer2 = Scanners.nextLine();

        if (answer2.equalsIgnoreCase("Lagundi")) {
            System.out.println("The price of " + answer2 + " is Php 12.00");
            System.out.println("Enter amount: ");
            int amount = Scanners.nextInt();
            int total = amount - 12;
            System.out.println("Your change is: " + total);
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Butamirate")) {
            System.out.println("The price of " + answer2 + " is Php 12.00");
            System.out.println("Enter amount: ");
            int amount = Scanners.nextInt();
            int total = amount - 12;
            System.out.println("Your change is: " + total);
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Ambroxol")) {System.out.println("The price of " + answer2 + " is Php 12.00");
            System.out.println("Enter amount: ");
            int amount = Scanners.nextInt();
            int total = amount - 12;
            System.out.println("Your change is: " + total);
            
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else {
            System.out.println("Invalid Input!!!!");
        }
    }

    public void decisionOrderHeadache() {
        Scanner Scanners = new Scanner(System.in);
        System.out.print("Enter Generic name: ");
        String answer2 = Scanners.nextLine();

        if (answer2.equalsIgnoreCase("Biogesic")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Rexidol")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Panadol")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else {
            System.out.println("Invalid Input!!!!");
        }
    }

    public void decisionOrderAllergy() {
        Scanner Scanners = new Scanner(System.in);
        System.out.print("Enter Generic name: ");
        String answer2 = Scanners.nextLine();
        if (answer2.equalsIgnoreCase("Allerta")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Claritin")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Elica")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else {
            System.out.println("Invalid Input!!!!");
        }
    }

    public void decisionOrderBodyPain() {
        Scanner Scanners = new Scanner(System.in);
        System.out.print("Enter Generic name: ");
        String answer2 = Scanners.nextLine();
        if (answer2.equalsIgnoreCase("Advil")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Alaxan")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else if (answer2.equalsIgnoreCase("Medicol")) {
            System.out.println("Successfully Ordered!!!!!");
            System.out.println("Do you want to do another transaction?\n\tPress 1 for Yes\n\tPress 2 to Exit.");
            String answer = Scanners.nextLine();
            if (answer == "1") {
                firstMenu();
            } else {
                System.out.println("THANK YOU FOR PATRONIZING RED PHARMACY!!!");
            }
        } else {
            System.out.println("Invalid Input!!!!");
        }
    }

    public void allMenu() {
//        firstMenu();
        secMenu();
    }

    public void ageValidation() {
        System.out.print("Enter age: ");
        int age = scanner1.nextInt();
        if (age < 18) {
            System.out.println("YOU ARE NOT ALLOWED TO ORDER!!!! SORRY FOR INCONVENIENCE!!!!");
        } else {

        }
    }

    public void orderMenu() {
        Scanner Scanners = new Scanner(System.in);
        System.out.print("\tORDER MEDICINE\nPress 1 for Cough\nPress 2 for Headache\nPress 3 for Allergy\nPress 4 for Body Pain\nEnter Choice:");
        int answer2 = Scanners.nextInt();
        if (answer2 == 1) {
            System.out.println("MEDICINE FOR COUGH");
            invent.InventoryCough();
            decisionOrderCough();
        } else if (answer2 == 2) {
            System.out.println("MEDICINE FOR HEADACHE");
            invent.InventoryHeadache();
            decisionOrderHeadache();
        } else if (answer2 == 3) {
            System.out.println("MEDICINE FOR ALLERGY");
            invent.InventoryAllergy();
            decisionOrderAllergy();
        } else if (answer2 == 4) {
            System.out.println("MEDICINE FOR ALLERGY");
            invent.InventoryBodyPain();
            decisionOrderBodyPain();
        }
    }

    public void regular() {
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("YOU ARE NOT ALLOWED TO ORDER!!!\nSORRY FOR THE INCONVENIENCE!!");
        } else if (age >= 18) {
            orderMenu();
        }
    }

    public void senior() {
        System.out.print("Enter age: ");
        int age = scanner1.nextInt();
        if (age >= 60) {
            System.out.println("YOU WILL RECEIVED A 20% DISCOUNT!!!!!");
            orderMenu();
        }
    }
}
