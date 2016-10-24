/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.Persistencia;

import Persistencia.EmpresaDAO;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author NAGOYA
 */
public class EmpresaDAOTest {
    
    @Test
    public void voltaEmpresaTest(){
        EmpresaDAO e = new EmpresaDAO();
        assertNotNull(e.voltaEmpresa());
    }
    
    @Test
    public void getEmpresasTest(){
        EmpresaDAO e = new EmpresaDAO();
        assertNotNull(e.getEmpresas());
    }
    
}
