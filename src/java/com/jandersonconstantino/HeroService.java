/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jandersonconstantino;

/**
 *
 * @author jandersonconstantino
 */
public class HeroService {

    public static String getHeroByScore(int score) {
        if (score >= 8 && score <= 10) {
            return "Você é o Homem-Aranha";
        }
        
        if (score >= 11 && score <= 13) {
            return "Você é o Doutor Estranho";
        }
        
        if (score >= 14 && score <= 16) {
            return "Você é a Feiticeira Escarlate";
        }
        
        if (score >= 17 && score <= 19) {
            return "Você é o Thor";
        }
        
        if (score >= 20 && score <= 22) {
            return "Você é o Hulk";
        }
        
        if (score >= 23 && score <= 25) {
            return "Você é a Viúva Negra";
        }
        
        if (score >= 26 && score <= 28) {
            return "Você é o Homem de Ferro";
        }
        
        if (score >= 29 && score <= 32) {
            return "Você é o Capitão América";
        }
        
        return "Não foi possível calcular com as respostas informadas.";
    }
}
