/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.entidades;

import entidade.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestPessoa {
    
    @Test
    public void testNome(){
        Pessoa p = new Pessoa("Teste", 12345678);
        assertEquals("Teste",p.getTelefone());
    }
    @Test
    public void testTelefone(){
        Pessoa p = new Pessoa("Teste", 12345678);
        assertEquals(new Long(12345678),new Long(p.getTelefone()));
    }
    
}
