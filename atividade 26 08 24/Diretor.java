/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

/**
 *
 * @author aluno.den
 */
public class Diretor extends Funcionario implements Contratacao{
    
    
    private final double PREMIO = 0.2;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double SalarioBase) {
        super(nome, dataNascimento, sexo, setor, SalarioBase);
    }
    
    public double getPREMIO() {
        return PREMIO;
    }
    
    @Override
    public double GetSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.SalarioBase * PREMIO;
        salarioFinal += super.SalarioBase;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nDiretor: " +
            "\nNome: " + super.nome +
            "\nData de Nascimento: " + super.dataNascimento +
            "\nSexo: " + super.sexo +
            "\nSetor: " + super.setor +               
            "\nSalário: " + super.SalarioBase +
            "\nPremio: " + PREMIO + 
            "\nSalario Final: " + this.GetSalarioFinal();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("- Admitindo funcionário - ");
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("- Demitindo funcionário - ");
        System.out.println("Dados do funcionário: ");
        System.out.println(funcionario.toString());
    }

    
}
