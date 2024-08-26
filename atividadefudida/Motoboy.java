/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author aluno.den
 */
public class Motoboy extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, String dataNascimento, Sexo sexo, Setor setor, double SalarioBase) {
        super(nome, dataNascimento, sexo, setor, SalarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    

    @Override
    public String toString() {
        return "\nMotoboy: " + 
               "\nNome: " + super.nome +
               "\nData de Nascimento: " + super.dataNascimento +
               "\nSexo: " + super.sexo +
               "\nSetor: " + super.setor +               
               "\nCarteira De Habilitacao: " + carteiraDeHabilitacao +
               "\nSalário: " + super.SalarioBase;
    }

    @Override
    public double GetSalarioFinal() {
        return this.SalarioBase;
    }

    
    
    
    
    
}
