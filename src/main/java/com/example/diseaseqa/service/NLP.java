package com.example.diseaseqa.service;

import com.hankcs.hanlp.dictionary.CoreDictionary;
import org.springframework.stereotype.Controller;

import java.util.LinkedList;
import java.util.TreeMap;

@Controller
public class NLP {
    public static LinkedList<String> segmentFully(String text, TreeMap<String, CoreDictionary.Attribute> dictionary){
        LinkedList<String> wordList = new LinkedList<String>();
        for (int i = 0;i<text.length();++i){
            for (int j = i+1;j<=text.length();++j){
                String word = text.substring(i,j);
                if (dictionary.containsKey(word))
                    wordList.add(word);
            }
        }
        return wordList;
    }
}
