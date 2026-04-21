/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vader
 */
public class AccountDTO { // DTO -> Data Transfer Object
    private int id;
    private String username;
    private String password;
    private String address;
    private int age;

    public AccountDTO() {
    }

    public AccountDTO(String username, String password, String address, int age) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.age = age;
    }

    
    public AccountDTO(int id, String username, String password, String address, int age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.address = address;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
