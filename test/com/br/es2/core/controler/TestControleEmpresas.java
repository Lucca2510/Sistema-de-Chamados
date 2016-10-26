/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.es2.core.controler;

import Persistencia.EmpresaDAO;
import controle.ControladorPrincipal;
import controle.ControleEmpresas;
import entidade.Empresa;
import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TestControleEmpresas {

    @Test
    public void testInserirChecar() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        Empresa e = new Empresa(1, "Teste");
        ce.inserir(1, "Teste");
        boolean retorno = ce.checar(new Long(1), "Teste");
        assertEquals(true, retorno);

    }

    @Test
    public void testValidar1() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        int validacao = ce.validar(1, "Teste");
        assertEquals(1, validacao);
    }

    @Test
    public void testValidar2() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        int validacao = ce.validar(50, "Teste");
        assertEquals(2, validacao);
    }

    @Test
    public void testValidar3() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        int validacao = ce.validar(1, "TesteValido");
        assertEquals(3, validacao);
    }

    @Test
    public void testValidar4() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        int validacao = ce.validar(50, "TesteValido");
        assertEquals(4, validacao);
    }

    @Test
    public void testeRetorna() {
        ControladorPrincipal cp = new ControladorPrincipal();
        ControleEmpresas ce = cp.getCtrEmpresa();
        Empresa e = ce.retorna(1, "Teste");
        assertEquals(1, e.getNumeroContrato());

    }

}
