/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.controler;

import controle.ControladorPrincipal;
import controle.ControleChamados;
import controle.ControleClientes;
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
public class TestControleChamados {

    @Test
    public void testAlterar() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleChamados cc = cp.getCtrChamados();
        Integer codigo = 1;

        String titulo = "Titulo do chamado";
        String descrição = "Descrição do chamado";
        int prioridade = 1;
        Tecnico tecnico = new Tecnico("João", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"), 1231231230, "03:00", 12345678);
        String sistemaOperacional = "Linux";
        String versaoSO = "2.0";
        String tipoConexao = "Local";
        String enderecoRede = "1";

        Chamado c1 = new Chamado(codigo, titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, tipoConexao, enderecoRede);
        Chamado c2 = cc.alterarChamado(c1, "Finalizado", "Problema de Conexão", "Manutenção");
        
        assertEquals("Finalizado", c2.getStatus());
        assertEquals("Problema de Conexão",c2.getCausaProblema());
        assertEquals("Manutenção",c2.getSolucaoProblema());
    }
    
    public void testQtdeChamados(){
        
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleChamados cc = cp.getCtrChamados();
        ControleClientes cc2 = cp.getCtrClientes();
        ClienteEmpresa c = cc2.incluiNovoCliente(new Empresa(1, "EmpresaTeste"), (long) 1234567891, "Teste", (long) 12345678);
        Integer codigo = 1;

        String titulo = "Titulo do chamado";
        String descrição = "Descrição do chamado";
        int prioridade = 1;
        Tecnico tecnico = new Tecnico("João", 12345678);
        ClienteEmpresa cliente = c;
        String sistemaOperacional = "Linux";
        String versaoSO = "2.0";
        String tipoConexao = "Local";
        String enderecoRede = "1";

        Chamado c1 = new Chamado(codigo, titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, tipoConexao, enderecoRede);
        int qtde = cc.validarQtdChamados(cliente);
        
        assertEquals(1,qtde);
    }

}
