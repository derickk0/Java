package com.mycompany.projeto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
public class Jurídica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;

    public Jurídica(String cnpj, String inscricaoEstadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\nDados de Pessoa Jurídica: " +
               "\nNome: " + super.nome +
               "\nTelefone: " + super.telefone +
               "\nCNPJ: " + cnpj +
               "\nInscrição Estadual: " + inscricaoEstadual;
    }

    
    
}
