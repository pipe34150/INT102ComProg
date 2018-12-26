/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationarray;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author INT102
 */
public class Story {
    private String storyName;
    private LocalDate writtenDate;
    private String content;
    
    public Story(Story s){
        this.storyName = s.storyName;
        this.writtenDate = s.writtenDate;
        this.content = s.content;
    }
    
    public Story(String storyName,LocalDate writtenDate,String content){
        this.storyName = storyName;
        this.writtenDate = writtenDate;
        this.content = content;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public LocalDate getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(LocalDate writtenDate) {
        this.writtenDate = writtenDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Story{" + "storyName=" + storyName + ", writtenDate=" + writtenDate + ", content=" + content + '}';
    }
    
    
}
