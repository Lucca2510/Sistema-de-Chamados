/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.entidades;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestRegistroChamado {
    
   @Test
   public void testCodigo(){
       Integer codigo = 1;
       
       String assunto="Problema de autenticação";
        
        String titulo="Titulo do chamado";
        String descrição="Descrição do chamado";
        int prioridade = 1;           
        Tecnico tecnico = new Tecnico("João", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "03:00", 12345678);
        String sistemaOperacional = "Linux";
        String versaoSO = "2.0";
        String bancoDeDados="Oracle";
        
        Chamado c1 = new  Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, bancoDeDados);
        RegistroChamado rc = new RegistroChamado(assunto, c1, tecnico);
        rc.setCodigo(codigo);
        
        assertEquals(new Long(1),new Long(rc.getCodigo()));
        
        
   }
    
}
