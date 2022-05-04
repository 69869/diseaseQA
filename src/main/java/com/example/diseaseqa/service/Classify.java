package com.example.diseaseqa.service;

public class Classify {
    public static String classify(String words){
        String answer;
        String questiontype = null;
        if(words.contains("是什么")) questiontype = "intro";
        else if(words.contains("症状")) questiontype = "symptom";
        else if(words.contains("表现")) questiontype = "symptom";
        else if(words.contains("引起")) questiontype = "cause";
        else if(words.contains("原因")) questiontype = "cause";
        else if(words.contains("治")) questiontype = "cure";
        else if(words.contains("怎么办")) questiontype = "cure";
        else if(words.contains("药")) questiontype = "medicine";
        else if(words.contains("吃什么")) questiontype = "medicine";
        else if(words.contains("科室")) questiontype = "department";
        else if(words.contains("属于")) questiontype = "department";
        else questiontype = "intro";
        return questiontype;
    }
}
