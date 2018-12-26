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
public class Diary {

    private String diaryName;
    private String diaryOwner;
    private Story stories[];
    private int lastIndex = 0;

    public Diary(int maxStories) {
        stories = new Story[maxStories];
    }

    public String getDiaryName() {
        return diaryName;
    }

    public void setDiaryName(String diaryName) {
        this.diaryName = diaryName;
    }

    public String getDiaryOwner() {
        return diaryOwner;
    }

    public void setDiaryOwner(String diaryOwner) {
        this.diaryOwner = diaryOwner;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    @Override
    public String toString() {
        return "Diary{" + "diaryName=" + diaryName + ", diaryOwner=" + diaryOwner + '}';
    }

    public Story getFirstStory() {
        return stories[0];
    }

    public Story getLastStory() {
        return stories[lastIndex-1];
    }

    public Story getStory(int index) {
        return stories[index];
    }

    public Story setStory(int index, Story s) {
        stories[index] = s;
        return s;
    }

    public boolean addStory(String storyName, LocalDate writtenDate, String content) {
        stories[lastIndex] = new Story(storyName, writtenDate, content);
        lastIndex++;
        return true;
    }

}
