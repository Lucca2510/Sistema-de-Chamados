package com.br.es2.core.entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestEmpresa {
    
    @Test
    public void testNroContrato(){
        Empresa e = new Empresa(1, "Teste");
        assertEquals(new Long(1),new Long(e.getNumeroContrato()));
    }
    @Test
    public void testNomeEmpresa(){
        Empresa e = new Empresa(1, "Teste");
        assertEquals("Teste",e.getNomeEmpresa());
    }
    
}
