package com.will.pojo;

public class AnswerQuestion {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public AnswerQuestion() {
    }

    public AnswerQuestion(String message, String answers) {
        this.message = message;
        this.answers = answers;
    }

    private String answers;

}
