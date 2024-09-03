/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;

/**
 *
 * @author aluno.den
 */
public class Projeto {

    public static void main(String[] args) {
        Motoboy motoca = new Motoboy("SLa", "kkk", "2020", Sexo.MASCULINO, Setor.OPERACOES, 50);
        Diretor direto = new Diretor("sla tbm", "1879", Sexo.FEMININO, Setor.RH, 10000);
        
        
        System.out.println(motoca.toString());
        System.out.println(direto.toString());
    }
}
