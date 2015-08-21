/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsite.jee7.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miyazaki
 */
@Entity
@Table(name = "m_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MUser.findAll", query = "SELECT m FROM MUser m"),
    @NamedQuery(name = "MUser.findByid", query = "SELECT m FROM MUser m WHERE m.id = :id"),
    @NamedQuery(name = "MUser.findByUserid", query = "SELECT m FROM MUser m WHERE m.userid = :userid"),
    @NamedQuery(name = "MUser.findByUsername", query = "SELECT m FROM MUser m WHERE m.username = :username"),
    @NamedQuery(name = "MUser.findByUsersort", query = "SELECT m FROM MUser m WHERE m.usersort = :usersort"),
    @NamedQuery(name = "MUser.findByPost", query = "SELECT m FROM MUser m WHERE m.post = :post")})
public class MUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "USERID")
    private String userid;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "USERSORT")
    private String usersort;
    @Column(name = "POST")
    private String post;

    public MUser() {
    }

    public MUser(String id) {
        this.userid = id;
    }

    public long getId() {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MUser)) {
            return false;
        }
        MUser other = (MUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techsite.MUser[ id=" + id + " ]";
    }
    
}
