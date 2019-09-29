/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchaseofmedicine;

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
    private int discount;
    
    
    public User() {
    }

    
    public User(String name, String address, int age, String username, String password, int discount) {
        this.name    = name;
        this.address = address;
        this.age = age;
        this.username = username;
        this.password = password;
        this.discount = discount;
    }

    public User(String name, String address, int age, String username, String password) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.username = username;
        this.password =password;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    
    

}
