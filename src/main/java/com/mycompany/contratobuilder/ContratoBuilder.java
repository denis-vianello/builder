/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contratobuilder;
import java.util.Date;

/**
 *
 * @author PICHAU
 */


public class ContratoBuilder {

    private Contrato contrato;

    public ContratoBuilder() {
        contrato = new Contrato();
    }

    public Contrato build() {

        if (contrato.getNumeroContrato() <= 0) {
            throw new IllegalArgumentException("Número do contrato inválido");
        }

        if (contrato.getNomeCliente() == null || contrato.getNomeCliente().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do cliente inválido");
        }

        if (contrato.getCpfCliente() == null || contrato.getCpfCliente().trim().isEmpty()) {
            throw new IllegalArgumentException("CPF do cliente não informado");
        }

        if (contrato.getNumeroConta() == null || contrato.getNumeroConta().trim().isEmpty()) {
            throw new IllegalArgumentException("Número da conta não informado");
        }

        if (contrato.getTipoContrato() == null || contrato.getTipoContrato().trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de contrato não informado");
        }

        if (contrato.getValorContratado() <= 0) {
            throw new IllegalArgumentException("Valor contratado inválido");
        }

        if (contrato.getTaxaJuros() < 0) {
            throw new IllegalArgumentException("Taxa de juros inválida");
        }

        if (contrato.getPrazoMeses() < 0) {
            throw new IllegalArgumentException("Prazo de pagamento inválido");
        }

        return contrato;
    }

    public ContratoBuilder setNumeroContrato(int numeroContrato) {
        contrato.setNumeroContrato(numeroContrato);
        return this;
    }

    public ContratoBuilder setNomeCliente(String nomeCliente) {
        contrato.setNomeCliente(nomeCliente);
        return this;
    }

    public ContratoBuilder setCpfCliente(String cpfCliente) {
        contrato.setCpfCliente(cpfCliente);
        return this;
    }

    public ContratoBuilder setNumeroConta(String numeroConta) {
        contrato.setNumeroConta(numeroConta);
        return this;
    }

    public ContratoBuilder setTipoContrato(String tipoContrato) {
        contrato.setTipoContrato(tipoContrato);
        return this;
    }

    public ContratoBuilder setValorContratado(double valorContratado) {
        contrato.setValorContratado(valorContratado);
        return this;
    }

    public ContratoBuilder setTaxaJuros(double taxaJuros) {
        contrato.setTaxaJuros(taxaJuros);
        return this;
    }

    public ContratoBuilder setPrazoMeses(int prazoMeses) {
        contrato.setPrazoMeses(prazoMeses);
        return this;
    }

    public ContratoBuilder setDataContratacao(Date dataContratacao) {
        contrato.setDataContratacao(dataContratacao);
        return this;
    }

    public ContratoBuilder setObservacoes(String observacoes) {
        contrato.setObservacoes(observacoes);
        return this;
    }
}
