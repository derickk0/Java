/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author aluno.den
 */
public abstract class Funcionario {
    String nome;
    String dataNascimento;
    Sexo sexo;
    Setor setor;
    double SalarioBase;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double SalarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.SalarioBase = SalarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }
    
    public abstract double GetSalarioFinal();
            
}
