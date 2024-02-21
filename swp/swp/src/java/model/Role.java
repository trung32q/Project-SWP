/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author tieup
 */
public class Role {
    private int id_role;
    private String role_name;

    public Role() {
    }

    public Role(int id_role, String role_name) {
        this.id_role = id_role;
        this.role_name = role_name;
    }

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" + "id_role=" + id_role + ", role_name=" + role_name + '}';
    }
    
}
