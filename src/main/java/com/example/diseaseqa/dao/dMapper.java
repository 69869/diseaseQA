package com.example.diseaseqa.dao;

import com.example.diseaseqa.entity.Disease;
import com.example.diseaseqa.entity.Feedback;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface dMapper {
    Disease selectByName(String name);
    String selectAnswer(String name,String questiontype);
    void insertFeedback(Feedback feedback);
}
