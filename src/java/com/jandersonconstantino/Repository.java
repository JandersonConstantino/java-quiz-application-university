/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jandersonconstantino;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jandersonconstantino
 */
public class Repository {
    public static ArrayList<Question> questions = new ArrayList(
            Arrays.asList(
                    new Question("Quem é você em uma festa de amigos?", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("A pessoa que controla a música e agita a festa.", 4),
                                    new Answer("Alguém entre os que estão dançando.", 2),
                                    new Answer("Está sempre perto da mesa de comida.", 3),
                                    new Answer("Está em casa, longe da festa.", 1)
                            )
                    )
                    ),

                    new Question("Em uma decisão difícil, com seus amigos, você:", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("Faz o que é certo, acima de tudo.", 4),
                                    new Answer("Decide em conjunto e faz o que todos acharem melhor.", 3),
                                    new Answer("Calcula as alternativas e mostra pra todo mundo onde há menos danos.", 2),
                                    new Answer("Espera alguém decidir e vai na onda.", 1)
                            )
                    )
                    ),
                    
                    new Question("Sua maior habilidade no meio da crise:", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("Força.", 3),
                                    new Answer("Lealdade.", 4),
                                    new Answer("Pensamento lógico.", 1),
                                    new Answer("Abordagem criativa.", 2)
                            )
                    )
                    ),
                    
                    new Question("Qual dessas frases se aplica mais a você?", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("\"Se eu tivesse oito horas para derrubar uma árvore, passaria seis afiando meu machado\" (Abraham Lincoln)", 1),
                                    new Answer("\"Mil vidas eu tivesse, mil vidas eu daria pela libertação da minha pátria\" (Tiradentes)", 4),
                                    new Answer("\"Lutar pelo amor é bom, mas alcançá-lo sem luta é melhor.\" (William Shakespeare)", 2),
                                    new Answer("\"O verdadeiro homem mede a sua força quando se defronta com o obstáculo.\" (Antoine de Saint-Exupéry)", 3)
                            )
                    )
                    ),
                    
                    new Question("Como você faz para que os outros realizem uma tarefa?", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("Cria um passo a passo para a realização da tarefa.", 1),
                                    new Answer("Explica a tarefa e apresenta os motivos pelos quais deveriam fazer.", 2),
                                    new Answer("Dá ordem de forma bem firme e direta.", 3),
                                    new Answer("Faz primeiro e chama a seguirem o seu exemplo.", 4)
                            )
                    )
                    ),
                    
                    new Question("Um colega seu está fazendo algo errado para prejudicar alguém. Você:", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("Monta um plano para expôr o que o colega está fazendo de errado.", 2),
                                    new Answer("Apronta algo para que ele se dê mal.", 1),
                                    new Answer("Conta para alguém que é autoridade sobre ele.", 4),
                                    new Answer("Confronta ele para tirar satisfações.", 3)
                            )
                    )
                    ),
                    
                    new Question("Qual desses adjetivos as outras pessoas usariam pra te descrever melhor?", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("Forte.", 3),
                                    new Answer("Inteligente.", 1),
                                    new Answer("Sem medo.", 2),
                                    new Answer("Habilidoso/a.", 4)
                            )
                    )
                    ),
                    
                    new Question("Com qual personagem dos Simpsons você mais se identifica?", new ArrayList<Answer>(
                            Arrays.asList(
                                    new Answer("Homer.", 2),
                                    new Answer("Marge.", 1),
                                    new Answer("Bart.", 3),
                                    new Answer("Lisa.", 4)
                            )
                    )
                    )
            )
    );
}
