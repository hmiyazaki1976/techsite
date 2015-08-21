/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsite.jee7.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author miyazaki
 */
@Entity
@Table(name = "m_workbook")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MWorkbook.findAll", query = "SELECT m FROM MWorkbook m"),
    @NamedQuery(name = "MWorkbook.findById", query = "SELECT m FROM MWorkbook m WHERE m.id = :id"),
    @NamedQuery(name = "MWorkbook.findByYear", query = "SELECT m FROM MWorkbook m WHERE m.year = :year"),
    @NamedQuery(name = "MWorkbook.findByHold", query = "SELECT m FROM MWorkbook m WHERE m.hold = :hold"),
    @NamedQuery(name = "MWorkbook.findByExam", query = "SELECT m FROM MWorkbook m WHERE m.exam = :exam"),
    @NamedQuery(name = "MWorkbook.findByTimedivision", query = "SELECT m FROM MWorkbook m WHERE m.timedivision = :timedivision"),
    @NamedQuery(name = "MWorkbook.findByQNo", query = "SELECT m FROM MWorkbook m WHERE m.qNo = :qNo"),
    @NamedQuery(name = "MWorkbook.findByExanswer", query = "SELECT m FROM MWorkbook m WHERE m.exanswer = :exanswer"),
    @NamedQuery(name = "MWorkbook.findByUpUser", query = "SELECT m FROM MWorkbook m WHERE m.upUser = :upUser"),
    @NamedQuery(name = "MWorkbook.findByUpTime", query = "SELECT m FROM MWorkbook m WHERE m.upTime = :upTime")})
public class MWorkbook implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 4)
    @Column(name = "year")
    private String year;
    @Size(max = 1)
    @Column(name = "hold")
    private String hold;
    @Size(max = 2)
    @Column(name = "exam")
    private String exam;
    @Size(max = 3)
    @Column(name = "timedivision")
    private String timedivision;
    @Size(max = 3)
    @Column(name = "qNo")
    private String qNo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "bodytext")
    private String bodytext;
    @Size(max = 1)
    @Column(name = "exanswer")
    private String exanswer;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "expound")
    private String expound;
    @Size(max = 10)
    @Column(name = "up_user")
    private String upUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "up_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date upTime;

    public MWorkbook() {
    }

    public MWorkbook(Long id) {
        this.id = id;
    }

    public MWorkbook(Long id, Date upTime) {
        this.id = id;
        this.upTime = upTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHold() {
        return hold;
    }

    public void setHold(String hold) {
        this.hold = hold;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getTimedivision() {
        return timedivision;
    }

    public void setTimedivision(String timedivision) {
        this.timedivision = timedivision;
    }

    public String getQNo() {
        return qNo;
    }

    public void setQNo(String qNo) {
        this.qNo = qNo;
    }

    public String getBodytext() {
        return bodytext;
    }

    public void setBodytext(String bodytext) {
        this.bodytext = bodytext;
    }

    public String getExanswer() {
        return exanswer;
    }

    public void setExanswer(String exanswer) {
        this.exanswer = exanswer;
    }

    public String getExpound() {
        return expound;
    }

    public void setExpound(String expound) {
        this.expound = expound;
    }

    public String getUpUser() {
        return upUser;
    }

    public void setUpUser(String upUser) {
        this.upUser = upUser;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
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
        if (!(object instanceof MWorkbook)) {
            return false;
        }
        MWorkbook other = (MWorkbook) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.techsite.jee7.entity.MWorkbook[ id=" + id + " ]";
    }
    
}
