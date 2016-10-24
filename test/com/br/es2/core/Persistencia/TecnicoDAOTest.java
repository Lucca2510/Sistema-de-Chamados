/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.Persistencia;

import Persistencia.TecnicoDAO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author NAGOYA
 */
public class TecnicoDAOTest {
    
    @Test
    public void gerarCodigoTest(){
        TecnicoDAO t = new TecnicoDAO();
        assertEquals(t.gerarCodigo(),1);
    }
    
    @Test
    public void voltaCashTecnicoTest(){
        TecnicoDAO t = new TecnicoDAO();
        assertNotNull(t.voltaCashTecnico());
    }
    
    
    
}
