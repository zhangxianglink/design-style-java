package com.will.utils;

import com.will.pojo.CheckQuestion;

import java.util.*;

public class RandomQuestionUtils {

    public static void random(CheckQuestion checkQuestion){
        Set<String> keys = checkQuestion.getChooseMap().keySet();
        ArrayList<String> randomKeys = new ArrayList<String>(keys);
        Collections.shuffle(randomKeys);
        HashMap<String, String> randomMap = new HashMap<String, String>();
        int count = 0;
        String newKey = "";
        for (String item:
                keys) {
            String randomKey = randomKeys.get(count++);
            if (item.equals(checkQuestion.getKey())){
                newKey = randomKey;
            }
            randomMap.put(randomKey,checkQuestion.getChooseMap().get(item));
        }
        checkQuestion.setKey(newKey);
        checkQuestion.setChooseMap(randomMap);
    }

}
