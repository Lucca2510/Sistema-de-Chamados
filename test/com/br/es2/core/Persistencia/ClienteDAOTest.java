/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.Persistencia;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31548751
 */
public class ClienteDAOTest {
    
    @Test
    public void gerarCodigoTest(){
        ClienteDAO c = new ClienteDAO();
        assertEquals(c.gerarCodigo(),1);
    }
    
    @Test
    public void validarCPFTest(){
        ClienteEmpresa cliente = new ClienteEmpresa(Integer.SIZE, null, 405392761, null, 30031987);
        ClienteDAO c = new ClienteDAO();
        
        assertTrue(c.validarCPF(cliente.getCpf()));
    }
    
    @Test
    public void voltaCashClienteTest(){
        ClienteDAO c = new ClienteDAO();
        assertNotNull(c.voltaCashCliente());
    }
    
    
}
