/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.entidades;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestChamado {
    
    @Test
    public void testEqualsBancodeDados(){
        
        String titulo="Titulo do chamado";
        String descrição="Descrição do chamado";
        int prioridade = 1;           
        Tecnico tecnico = new Tecnico("João", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "03:00", 12345678);
        String sistemaOperacional = "Linux";
        String versaoSO = "2.0";
        String bancoDeDados="Oracle";
        
        Chamado c1 = new  Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, bancoDeDados);
        Chamado c2 = new  Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, bancoDeDados);
        assertEquals(true,c1.equals(c2));
    }
    
    @Test
    public void testEqualsDesempenho(){
       
        String titulo="Titulo do chamado";
        String descrição="Descrição do chamado";
        int prioridade = 1;            
        Tecnico tecnico = new Tecnico("João", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "03:00", 12345678);
        String sistemaOperacional = "Linux";
        String versaoSO = "2.0";        
        String operacao="Att";
        double tempoOperacao = 1;
        
        Chamado c1=new Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, operacao, tempoOperacao);
        Chamado c2=new Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, operacao, tempoOperacao);
        
        assertEquals(true,c1.equals(c2));
    }
    
    @Test
    public void testEqualsRede(){
        Integer codigo = 1;
        
        String titulo="Titulo do chamado";
        String descrição="Descrição do chamado";
        int prioridade = 1;            
        Tecnico tecnico = new Tecnico("João", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "03:00", 12345678);
        String sistemaOperacional = "Linux";
        String versaoSO = "2.0";        
        String tipoConexao="Local";
        String enderecoRede="1";       
        
        Chamado c1 = new Chamado(codigo, titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, tipoConexao, enderecoRede);
        Chamado c2 = new Chamado(codigo, titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, tipoConexao, enderecoRede);
        
        assertEquals(true,c1.equals(c2));
    }
    
}
