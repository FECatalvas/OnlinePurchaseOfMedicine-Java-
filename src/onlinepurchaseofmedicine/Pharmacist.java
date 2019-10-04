/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchaseofmedicine;

import java.util.ArrayList;

/**
 *
 * @author catalvasfa_sd2022
 */
public class Pharmacist extends User{

    public Pharmacist() {
    }

    public Pharmacist(String name, String address, int age, String username, String password) {
        super(name, address, age, username, password);
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    @Override
    public void registerMenu() {
        super.registerMenu(); 
    }

    @Override
    public User loginMenu() {
        return super.loginMenu(); 
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); 
    }

    @Override
    public String getPassword() {
        return super.getPassword(); 
    }

    @Override
    public void setUsername(String username) {
        super.setUsername(username); 
    }

    @Override
    public String getUsername() {
        return super.getUsername(); 
    }

    @Override
    public void setAge(int age) {
        super.setAge(age); 
    }

    @Override
    public int getAge() {
        return super.getAge(); 
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address); 
    }

    @Override
    public String getAddress() {
        return super.getAddress(); 
    }

    @Override
    public void setName(String name) {
        super.setName(name); 
    }

    @Override
    public String getName() {
        return super.getName(); 
    }
    public void updateMedicine(){
    
    }
}
