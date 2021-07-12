package com.will.pojo;

import com.will.pojo.AnswerQuestion;
import com.will.pojo.CheckQuestion;
import com.will.utils.RandomQuestionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class QuestionBank implements Cloneable{

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String code;

    private ArrayList<CheckQuestion> choiceQuestionList = new ArrayList<CheckQuestion>();

    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();

    public QuestionBank append(CheckQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }
    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
        questionBank.choiceQuestionList = (ArrayList<CheckQuestion>) choiceQuestionList.clone();
        Collections.shuffle(questionBank.answerQuestionList);
        Collections.shuffle(questionBank.choiceQuestionList);
        questionBank.choiceQuestionList.forEach(e -> RandomQuestionUtils.random(e));
        return questionBank;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考⽣：" + username +
                "\r\n" +
                "考号：" + code + "\r\n" +
                "--------------------------------------------\r\n" +
                "⼀、选择题" + "\r\n\n");
        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx +
                    1).append("题：").append(choiceQuestionList.get(idx).getMessage()).append("\r\n");
                    Map<String, String> option =
                            choiceQuestionList.get(idx).getChooseMap();
            for (String key : option.keySet()) {

                detail.append(key).append("：").append(option.get(key)).append("\r\n");;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        detail.append("⼆、问答题" + "\r\n\n");
        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx +
                    1).append("题：").append(answerQuestionList.get(idx).getMessage()).append("\r\n");
                    detail.append("答案：").append(answerQuestionList.get(idx).getAnswers()).append("\r\n");
        }
        return detail.toString();
    }
}
