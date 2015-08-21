/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsite.jee7.dao;

import com.techsite.jee7.entity.MWorkbook;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author miyazaki
 */
@Stateless
public class MWorkbookFacade extends AbstractFacade<MWorkbook> {
    @PersistenceContext(unitName = "com_techSite_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MWorkbookFacade() {
        super(MWorkbook.class);
    }
    
}
