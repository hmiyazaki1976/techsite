/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsite.jee7.web;

import com.techsite.jee7.logic.MUserLogic;
import com.techsite.jee7.entity.MUser;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.ejb.EJB;

/**
 *
 * @author miyazaki
 */
@Named
@ViewScoped
public class IndexBean implements Serializable {
    private Long id;
    private String userid;
    private String username;
    private String usersort;
    private String post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsersort() {
        return usersort;
    }

    public void setUsersort(String usersort) {
        this.usersort = usersort;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    
    @EJB
    private MUserLogic mulogic;
    
    public String regInfo() {
        MUser muser = new MUser();
        muser.setId(Long.parseLong("0"));
        muser.setUserid(this.userid);
        muser.setUsername(this.username);
        muser.setUsersort(this.usersort);
        muser.setPost(this.post);
        this.mulogic.register(muser);
        return "";
    }
    
}
