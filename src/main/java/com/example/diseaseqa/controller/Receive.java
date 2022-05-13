package com.example.diseaseqa.controller;

import com.example.diseaseqa.dao.dMapper;
import com.example.diseaseqa.entity.Disease;
import com.example.diseaseqa.entity.Feedback;
import com.example.diseaseqa.service.Classify;
import com.example.diseaseqa.service.SearchName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@Controller
@RequestMapping("/receive")
public class Receive {
    @Autowired
    dMapper dmapper;
    String name;
    Disease d = new Disease();
     @RequestMapping(path = "/words")
     public void save(HttpServletRequest request, HttpServletResponse response) {
         String question = request.getParameter("question");
         String answer;
         if (question.isEmpty()) answer = "问题为空";
         try {
             name = SearchName.searchName(question);
             d = dmapper.selectByName(name);
         } catch (Exception e) {
             name = null;
         }
         try {
             name = d.getName();
         } catch (Exception e) {
             name = null;
         }
         String questiontype = Classify.classify(question);
         if (name == null) answer = "无答案";
         else if (name.isEmpty()) answer = "无答案";
         else answer = dmapper.selectAnswer(name, questiontype);
         response.setContentType("text/plain;charset=utf-8");
         PrintWriter writer = null;
         try {
             writer = response.getWriter();
         } catch (IOException e) {
             e.printStackTrace();
         }
         writer.write(answer);
     }

     @RequestMapping(path = "/feedback",method = RequestMethod.POST)
     @ResponseBody
    public String feedback(Feedback fb){
         System.out.println(fb);
         dmapper.insertFeedback(fb);
         return "<h1 align='center'>反馈成功</h1>";
     }
}
