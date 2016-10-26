/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.controler;

import controle.ControladorPrincipal;
import controle.ControleTecnicos;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestControleTecnicos {
    
    @Test
    public void testInserir(){
        ControladorPrincipal cp = new ControladorPrincipal();        
        ControleTecnicos ct = cp.getCtrTecnicos();
        Tecnico t1 = ct.inserir(12345678, "João");
        assertEquals("João",t1.getNome());
    }
    
    @Test
    public void testInserir2(){
        ControladorPrincipal cp = new ControladorPrincipal();        
        ControleTecnicos ct = cp.getCtrTecnicos();
        Tecnico t1 = ct.inserir(12345678, "João");
        assertEquals(new Long(12345678),new Long(t1.getTelefone()));
    }
    
}
