/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tieup
 */
public class User {
    private int Id_account;
    private String username;
    private String password;
    private String email;
    private String role_project;
    private String Id_role;
    private String status;

    public User() {
    }

    public User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public User(String username, String password, String email, String role_project, String Id_role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role_project = role_project;
        this.Id_role = Id_role;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole_project() {
        return role_project;
    }

    public void setRole_project(String role_project) {
        this.role_project = role_project;
    }

    public String getId_role() {
        return Id_role;
    }

    public void setId_role(String Id_role) {
        this.Id_role = Id_role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", email=" + email + ", role_project=" + role_project + ", Id_role=" + Id_role + ", status=" + status + '}';
    }
 
    
    
}
