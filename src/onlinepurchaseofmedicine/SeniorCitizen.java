/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinepurchaseofmedicine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author catalvasfa_sd2022
 */
public class SeniorCitizen extends User{

    public SeniorCitizen() {
    }

    public SeniorCitizen(String name, String address, int age, String username, String password) {
        super(name, address, age, username, password);
    }

    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

}
