/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisantos.aula8;

import java.util.Arrays;

/**
 *
 * @author ferauche
 */
public class Aula8 {
    
    public static void main(String args[]) {
        /*
        String str1 = "ZZZZZZZZ";
        String str2 = "Strings are immutable";
        
        int result = str1.compareTo(str2);
        
        System.out.println(result);
        */
        
        Pessoa p1 = new Pessoa("Thiago Ferauche", 43);
        Pessoa p2 = new Pessoa("Thais Ferauche", 40);
        Pessoa p3 = new Pessoa("Ciro", 53);
        Pessoa p4 = new Pessoa("Claudia", 33);
        
        Pessoa pessoas[] = { p1, p2, p3, p4 };
        
        Arrays.sort(pessoas);
        
        for(Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }
        
    }
    
}
