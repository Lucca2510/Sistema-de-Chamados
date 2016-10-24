/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.Persistencia;

import Persistencia.ChamadoDAO;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author NAGOYA
 */
public class ChamadoDAOTest {
    
    @Test
    public void gerarCodigoTest(){
        ChamadoDAO c = new ChamadoDAO();
        assertEquals(c.gerarCodigo(),1);
    }
    
    @Test
    public void gerarCodigoRegistroChamadoTest(){
        ChamadoDAO c = new ChamadoDAO();
        assertEquals(c.gerarCodigoRegistroChamado(),1);
    }
    
    
    
}
