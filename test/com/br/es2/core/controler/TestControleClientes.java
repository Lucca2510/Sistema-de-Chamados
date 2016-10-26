/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.controler;

import Persistencia.ClienteDAO;
import controle.ControladorPrincipal;
import controle.ControleClientes;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestControleClientes {
    
   @Test
   public void TestGetClienteDao(){
       ControladorPrincipal cp = new ControladorPrincipal();
       ControleClientes cc = cp.getCtrClientes();
       ClienteDAO cdao= cc.getClienteDAO();
       assertEquals(true,cdao instanceof ClienteDAO);
   }
   
   @Test
   public void testInserir(){
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleClientes cc = cp.getCtrClientes();
        ClienteEmpresa c = cc.incluiNovoCliente(new Empresa(1, "EmpresaTeste"), (long) 1234567891, "Teste", (long) 12345678);
        assertEquals((long) 1234567891,c.getCpf());
   }
}
