package com.will.service;

import com.will.pojo.AnswerQuestion;
import com.will.pojo.CheckQuestion;
import com.will.pojo.QuestionBank;

import java.util.HashMap;
import java.util.Map;

public class InitPaper {

    private QuestionBank questionBank = new QuestionBank();

    public InitPaper() {
            Map<String, String> map01 = new HashMap<String, String>();
            map01.put("A", "JAVA2 EE");
            map01.put("B", "JAVA2 Card");
            map01.put("C", "JAVA2 ME");
            map01.put("D", "JAVA2 HE");
            map01.put("E", "JAVA2 SE");
            Map<String, String> map02 = new HashMap<String, String>();
            map02.put("A", "JAVA程序的main⽅法必须写在类⾥⾯");
            map02.put("B", "JAVA程序中可以有多个main⽅法");
            map02.put("C", "JAVA程序中类名必须与⽂件名⼀样");
            map02.put("D", "JAVA程序的main⽅法中如果只有⼀条语句，可以不⽤{}(⼤括号)括 起来");
                    Map<String, String> map03 = new HashMap<String, String>();
            map03.put("A", "变量由字⺟、下划线、数字、$符号随意组成；");
            map03.put("B", "变量不能以数字作为开头；");
            map03.put("C", "A和a在java中是同⼀个变量；");
            map03.put("D", "不同类型的变量，可以起相同的名字；");
            Map<String, String> map04 = new HashMap<String, String>();
            map04.put("A", "STRING");
            map04.put("B", "x3x;");
            map04.put("C", "void");
            map04.put("D", "de$f");
            Map<String, String> map05 = new HashMap<String, String>();
            map05.put("A", "31");
            map05.put("B", "0");
            map05.put("C", "1");
            map05.put("D", "2");

            questionBank.append(new CheckQuestion("JAVA所定义的版本中不包括", map01, "D"))
                    .append(new CheckQuestion("下列说法正确的是", map02, "A"))
                    .append(new CheckQuestion("变量命名规范说法正确的是", map03,
                            "B"))
                    .append(new CheckQuestion("以下()不是合法的标识符",map04,
                            "C"))
                    .append(new CheckQuestion("表达式(11+3*8)/4%3的值是",
                            map05, "D"))
                    .append(new AnswerQuestion("⼩红⻢和⼩⿊⻢⽣的⼩⻢⼏条腿", "4条 腿"))
                    .append(new AnswerQuestion("铁棒打头疼还是⽊棒打头疼", "头最 疼"))
                    .append(new AnswerQuestion("什么床不能睡觉", "⽛床"))
                    .append(new AnswerQuestion("为什么好⻢不吃回头草", "后⾯的草没 了"));
    }

    public  String createPaper(String username, String code) throws CloneNotSupportedException {
        QuestionBank clone = (QuestionBank) questionBank.clone();
        clone.setCode(code);
        clone.setUsername(username);
        return clone.toString();
    }

}
