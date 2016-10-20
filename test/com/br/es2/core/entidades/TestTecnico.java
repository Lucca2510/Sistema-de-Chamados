/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.entidades;

import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestTecnico {
    
    @Test
    public void testNome(){
        Tecnico t = new Tecnico("Test", 12345678);
        assertEquals("Test",t.getNome());
    }
    
    @Test
    public void testTelefone(){
        Tecnico t = new Tecnico("Test", 12345678);
        assertEquals(new Long(12345678),new Long(t.getTelefone()));
    }
    
}
