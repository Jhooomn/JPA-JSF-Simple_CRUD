/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.dao.ImplDao;
import com.implDao.IUser;
import java.io.Serializable;
import com.entity.User;
/**
 *
 * @author Jhon Baron
 */
public class UserServices extends ImplDao<User, Integer> implements IUser, Serializable{
    
}
