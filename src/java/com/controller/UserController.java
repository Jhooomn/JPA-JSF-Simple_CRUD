/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.User;
import com.services.UserServices;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Jhon Baron
 */
@ManagedBean
@SessionScoped
public class UserController {

    /**
     * Creates a new instance of UserController
     */
    User user = new User();
    User edit_user = new User();
    UserServices uservices = new UserServices();
    List<User> userlist = new LinkedList();

    public UserController() {
        getUsers();
    }

    public void getUsers() {
        userlist = uservices.consultarTodo(User.class);
    }

    public void addUser() {
        System.out.println("ID; " + user.getIduser());
        if (user.getIduser() == null) {
            uservices.crear(user);
            user = new User();
            getUsers();
        }else{
            uservices.modificar(user);
            getUsers();
            user = new User();
        }
    }

    public void deleteUser(User us) {
        uservices.eliminar(us);
        getUsers();
    }

    public void updateUser(User us) {
        user = us;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserServices getUservices() {
        return uservices;
    }

    public void setUservices(UserServices uservices) {
        this.uservices = uservices;
    }

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public User getEdit_user() {
        return edit_user;
    }

    public void setEdit_user(User edit_user) {
        this.edit_user = edit_user;
    }

}
