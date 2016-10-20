/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.entidades;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestClienteEmpresa {
    
   @Test
    public void testName(){
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Teste");
        long cpf=1234567891;
        String nome="Test";
        long telefone=12345678;
        
        ClienteEmpresa ce = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals("Test",ce.getNome());
    }    
    
   @Test
   public void testCpf(){
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Teste");
        long cpf=1234567891;
        String nome="Test";
        long telefone=12345678;
        
        ClienteEmpresa ce = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals(new Long(1234567891),new Long(ce.getCpf()));
   }
   @Test
   public void testNome(){
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Teste");
        long cpf=1234567891;
        String nome="Test";
        long telefone=12345678;
        
        ClienteEmpresa ce = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals("Test",ce.getNome());
   }
   @Test
   public void testTelefone(){
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Teste");
        long cpf=1234567891;
        String nome="Test";
        long telefone=12345678;
        
        ClienteEmpresa ce = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals(new Long(12345678),new Long(ce.getTelefone()));
   }
    
}
