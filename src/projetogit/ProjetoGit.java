/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetogit;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author teste
 */
public class ProjetoGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);        
        
        
        System.out.println("Olá Mundo");
        
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        
        System.out.println("Bem-Vindo " + nome);
        
        
    }
    
}
