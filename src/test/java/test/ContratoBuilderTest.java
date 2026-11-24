/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.mycompany.contratobuilder.Contrato;
import com.mycompany.contratobuilder.ContratoBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContratoBuilderTest {

    @Test
    public void deveConstruirContratoEmprestimo() {

        Contrato contrato = new ContratoBuilder()
                .setNumeroContrato(1001)
                .setNomeCliente("Carlos Silva")
                .setCpfCliente("12345678900")
                .setNumeroConta("12345-6")
                .setTipoContrato("EMPRESTIMO")
                .setValorContratado(10000)
                .setTaxaJuros(2.0)
                .setPrazoMeses(12)
                .build();

        assertEquals(1001, contrato.getNumeroContrato());
        assertEquals("Carlos Silva", contrato.getNomeCliente());
        assertEquals("EMPRESTIMO", contrato.getTipoContrato());
        assertEquals(10000, contrato.getValorContratado());
        assertEquals(2.0, contrato.getTaxaJuros());
        assertEquals(12, contrato.getPrazoMeses());
    }

    @Test
    public void deveConstruirContratoFinanciamento() {

        Contrato contrato = new ContratoBuilder()
                .setNumeroContrato(1002)
                .setNomeCliente("Maria Oliveira")
                .setCpfCliente("98765432100")
                .setNumeroConta("98765-4")
                .setTipoContrato("FINANCIAMENTO")
                .setValorContratado(50000)
                .setTaxaJuros(1.5)
                .setPrazoMeses(48)
                .build();

        assertEquals(1002, contrato.getNumeroContrato());
        assertEquals("Maria Oliveira", contrato.getNomeCliente());
        assertEquals("FINANCIAMENTO", contrato.getTipoContrato());
        assertEquals(50000, contrato.getValorContratado());
        assertEquals(1.5, contrato.getTaxaJuros());
        assertEquals(48, contrato.getPrazoMeses());
    }

    @Test
    public void naoDeveConstruirContratoSemNumero() {

        ContratoBuilder builder = new ContratoBuilder()
                .setNomeCliente("Carlos Silva")
                .setCpfCliente("12345678900")
                .setNumeroConta("12345-6")
                .setTipoContrato("EMPRESTIMO")
                .setValorContratado(10000);

        assertThrows(IllegalArgumentException.class, builder::build);
    }

    @Test
    public void naoDeveConstruirContratoComValorInvalido() {

        ContratoBuilder builder = new ContratoBuilder()
                .setNumeroContrato(1003)
                .setNomeCliente("Carlos Silva")
                .setCpfCliente("12345678900")
                .setNumeroConta("12345-6")
                .setTipoContrato("EMPRESTIMO")
                .setValorContratado(0);

        assertThrows(IllegalArgumentException.class, builder::build);
    }

    @Test
    public void naoDeveConstruirContratoSemNomeCliente() {

        ContratoBuilder builder = new ContratoBuilder()
                .setNumeroContrato(1004)
                .setCpfCliente("12345678900")
                .setNumeroConta("12345-6")
                .setTipoContrato("EMPRESTIMO")
                .setValorContratado(10000);

        assertThrows(IllegalArgumentException.class, builder::build);
    }
}
