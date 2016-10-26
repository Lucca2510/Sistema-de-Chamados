/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.Persistencia;

import Persistencia.TecnicoDAO;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author NAGOYA
 */
public class TecnicoDAOTest {
    
    @Test
    public void gerarCodigoTestGreaterZero(){
        TecnicoDAO t = new TecnicoDAO();
        assertTrue(t.gerarCodigo()>0);
    }
    
    @Test
    public void gerarCodigoTestNegative(){
        TecnicoDAO t = new TecnicoDAO();
        assertFalse(t.gerarCodigo()<0);
    }
    
    @Test
    public void gerarCodigoTestWithZero(){
        TecnicoDAO t = new TecnicoDAO();
        assertFalse(t.gerarCodigo()==0);
    }
    
    @Test
    public void voltaCashTecnicoTestNotNull(){
        TecnicoDAO t = new TecnicoDAO();
        assertNotNull(t.voltaCashTecnico());
    }
    
    @Test
    public void getTestNotNull(){
        TecnicoDAO t = new TecnicoDAO();
        assertNull(t.get(-1));
    }
    
    
}
