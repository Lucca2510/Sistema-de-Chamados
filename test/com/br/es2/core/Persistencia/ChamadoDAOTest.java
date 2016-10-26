/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.Persistencia;

import Persistencia.ChamadoDAO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author NAGOYA
 */
public class ChamadoDAOTest {
    
    @Test
    public void gerarCodigoTestNegative(){
        ChamadoDAO c = new ChamadoDAO();
        assertFalse(c.gerarCodigo()<0);
    }
    
    @Test
    public void gerarCodigoTestGreaterZero(){
        ChamadoDAO c = new ChamadoDAO();
        assertTrue(c.gerarCodigo()>0);
    }
    
    @Test
    public void gerarCodigoRegistroChamadoTestGreaterZero(){
        ChamadoDAO c = new ChamadoDAO();
        assertTrue(c.gerarCodigoRegistroChamado()>0);
    }
    
    @Test
    public void gerarCodigoRegistroChamadoTestNegative(){
        ChamadoDAO c = new ChamadoDAO();
        assertFalse(c.gerarCodigoRegistroChamado()<0);
    }
    
    @Test
    public void getChamadosTestNotNull(){
        ChamadoDAO c = new ChamadoDAO();
        assertNotNull(c.getChamados());
    }
    
    @Test
    public void getRegistrosTestNotNull(){
        ChamadoDAO c = new ChamadoDAO();
        assertNotNull(c.getRegistros());
    }
    
    @Test
    public void getTestWithZero(){
        ChamadoDAO c = new ChamadoDAO();
        assertNull(c.get(0));
    }
    
    @Test
    public void getTestNegative(){
        ChamadoDAO c = new ChamadoDAO();
        assertNull(c.get(-1));
    }
    
    
}
