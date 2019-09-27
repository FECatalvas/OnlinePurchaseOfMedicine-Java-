/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchaseofmedicine;

import java.util.*;

/**
 *
 * @author 2ndyrGroupB
 */
public class Feature {

    ArrayList<User> user = new ArrayList();

    public User loginMenu() {
        System.out.println("\nLOGIN\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user1 : user) {
            if (user1.getUsername().equals(username)
                    && user1.getPassword().equals(password)) {
                return user1;
            }
        }
        return null;

    }

    public void registerMenu() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("REGISTER");

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner1.nextInt();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        user.add(new User(name, address, age, username, password));

    }

    public void medicineMenu() {

    }
}
