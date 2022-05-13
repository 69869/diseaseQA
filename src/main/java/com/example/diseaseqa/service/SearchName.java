package com.example.diseaseqa.service;

import com.hankcs.hanlp.corpus.io.IOUtil;
import com.hankcs.hanlp.dictionary.CoreDictionary;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.TreeMap;

@Controller
public class SearchName {
    public static String searchName(String words) throws IOException {
        TreeMap<String, CoreDictionary.Attribute> dictionary =
                IOUtil.loadDictionary("src/main/resources/static/disease.txt");
        LinkedList<String> temp = NLP.segmentFully(words,dictionary);
        String name = temp.getFirst();
        return name;
    }
}
