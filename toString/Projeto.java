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
        Física pessoaFisica = new Física("123456789","1234567890", "12/12/12", "John Peter Mccalister", "12345678901");
        Jurídica pessoaJuridica = new Jurídica("123456789", "12435346", "voz de galinha", "1353454357");
        
        System.out.println(pessoaFisica.toString());
        System.out.println(pessoaJuridica.toString());
    }
}
