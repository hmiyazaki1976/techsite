/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsite.jee7.logic;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import com.techsite.jee7.dao.MUserFacade;
import com.techsite.jee7.entity.MUser;

/**
 *
 * @author miyazaki
 */
@Stateless
public class MUserLogic {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
   @EJB
   private MUserFacade MUserDao;
   
   public MUser register(MUser muser) {
       this.MUserDao.create(muser);
       return muser;
   }
}
