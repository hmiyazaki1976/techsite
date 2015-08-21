/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsite.jee7.logic;

import javax.ejb.Stateless;
import javax.ejb.EJB;
import com.techsite.jee7.entity.MWorkbook;
import com.techsite.jee7.dao.MWorkbookFacade;


/**
 *
 * @author miyazaki
 */
@Stateless
public class MWorkbookLogic {

   @EJB
   private MWorkbookFacade MWorkbookDao;
   
   public MWorkbook register(MWorkbook workbook) {
       this.MWorkbookDao.create(workbook);
       return workbook;
   }
}
