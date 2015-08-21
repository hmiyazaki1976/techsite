/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsite.jee7.web;

import com.techsite.jee7.entity.MWorkbook;
import com.techsite.jee7.logic.MWorkbookLogic;
import javax.ejb.EJB;

/**
 *
 * @author miyazaki
 */
public class questionEntryBean {
    private String id;
    private String year;
    private String hold;
    private String exam;
    private String timedivision;
    private String qNo;
    private String bodytext;
    private String exanswer;
    private String expound;
    private String upUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getqNo() {
        return qNo;
    }

    public void setqNo(String qNo) {
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
    
    @EJB
    private MWorkbookLogic mwlogic;
    
    public String regInfo() {
        MWorkbook mw = new MWorkbook();
        mw.setId(Long.MIN_VALUE);
        mw.setYear(this.year);
        mw.setHold(this.hold);
        mw.setExam(this.exam);
        mw.setTimedivision(this.timedivision);
        mw.setQNo(this.qNo);
        mw.setBodytext(this.bodytext);
        mw.setExanswer(this.exanswer);
        mw.setExpound(this.expound);
        mw.setUpUser(this.upUser);
        this.mwlogic.register(mw);
        return "";
    }    
}
