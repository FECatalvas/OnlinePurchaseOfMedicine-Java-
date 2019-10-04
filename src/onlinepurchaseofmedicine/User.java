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
public class User {

    private String name;
    private String address;
    private int age;
    private String username;
    private String password;

    public User() {
    }

    public User(String name, String address, int age, String username, String password ){
        this.name = name;
        this.address = address;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    ArrayList<User> user = new ArrayList();

    public User loginMenu() {
        System.out.println("\n--------------------LOGIN-----------------------");
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
        System.out.println("--------------------REGISTER--------------------");

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
}

