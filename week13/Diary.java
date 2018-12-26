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
        StringBuilder diaryString = new StringBuilder();
        diaryString.append("Diary Name : " + diaryName + "\n");
        diaryString.append("Diary Owner : " + diaryOwner + "\n");
        
        for (int i = 0 ; i < lastIndex ; i ++ ){
            diaryString.append(stories[i].toString() + "\n");
        }
        return diaryString.toString();
    }

    public Story getFirstStory() {
        if(lastIndex > 0){
            return stories[0];
        }
        else return null;
    }

    public Story getLastStory() {
        if(lastIndex > 0){
            return stories[lastIndex-1];
        }
        else return null;
    }

    public Story getStory(int index) {
        if(lastIndex >= index || index >= 0){
            return stories[index];
        }
        else return null;
    }

    public Story setStory(int index, Story s) {
        if(lastIndex >= index || index >= 0){
            stories[index] = s;
            return s;
        }
        else return null;
    }

    public boolean addStory(String storyName, LocalDate writtenDate, String content) {
        if(stories.length >= lastIndex){
            stories[lastIndex] = new Story(storyName, writtenDate, content);        
            lastIndex++;
            return true;
        }
        else return false;
    }
    
    public int indexOf (Story s){
        for (int i = 0; i < lastIndex ; i++) {
            if(stories[i].isMatch(s)){
                return i;
            }
        }
        return -1;   
    }
    
    public Story[] getStories(){
        return stories;
    }
    
    public Story removeStory(int removeIndex){
        if(lastIndex >= removeIndex || removeIndex >= 0){
            //Story remove = stories[removeIndex];
            Story remove = new Story();
            remove = this.stories[removeIndex];
            
            for(int i = removeIndex ; i < lastIndex-1 ; i++){
                stories[i] = stories[i+1];
            }
            lastIndex--;
            return remove;
        }
        else return null;
    }
    
}
