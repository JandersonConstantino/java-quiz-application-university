/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jandersonconstantino;

import java.util.ArrayList;

/**
 *
 * @author jandersonconstantino
 */
public class Question {
    String description;
    ArrayList<Answer> answers;
    
    public Question(String description, ArrayList<Answer> answers) {
        this.description = description;
        this.answers = answers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Answer> answers) {
        this.answers = answers;
    }
}