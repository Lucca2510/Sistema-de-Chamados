/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.Persistencia;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31548751
 */
public class ClienteDAOTest {
    
    @Test
    public void gerarCodigoTestGreaterZero(){
        ClienteDAO c = new ClienteDAO();
        assertTrue(c.gerarCodigo()>0);
    }
    
    @Test
    public void gerarCodigoTestNegative(){
        ClienteDAO c = new ClienteDAO();
        assertFalse(c.gerarCodigo()<0);
    }
    
    @Test
    public void validarCPFTestWithZero(){
        ClienteEmpresa cliente = new ClienteEmpresa(Integer.SIZE, null, 0, null, 30031987);
        ClienteDAO c = new ClienteDAO();
        
        assertFalse(c.validarCPF(cliente.getCpf()));
    }
    @Test
    public void validarCPFTestWithNegative(){
        ClienteEmpresa cliente = new ClienteEmpresa(Integer.SIZE, null, -5, null, 30031987);
        ClienteDAO c = new ClienteDAO();
        
        assertFalse(c.validarCPF(cliente.getCpf()));
    }
    
    @Test
    public void voltaCashClienteTestNotNull(){
        ClienteDAO c = new ClienteDAO();
        assertNotNull(c.voltaCashCliente());
    }
    
   
    
    
}
