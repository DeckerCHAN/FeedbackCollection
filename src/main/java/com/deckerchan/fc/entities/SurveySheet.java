package com.deckerchan.fc.entities;

import com.deckerchan.fc.entities.question.Questions;

/**
 * Created by deckerchan on 20/12/16.
 */
public class SurveySheet {

    private String sheetCode;

    public String getSheetCode() {
        return sheetCode;
    }

    public void setSheetCode(String sheetCode) {
        this.sheetCode = sheetCode;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    private Questions questions;
}
