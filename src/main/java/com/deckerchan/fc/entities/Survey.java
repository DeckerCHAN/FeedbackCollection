package com.deckerchan.fc.entities;

import com.deckerchan.fc.entities.question.Questions;

/**
 * Created by deckerchan on 22/12/16.
 */
public class Survey extends SurveySheet {
    private Customer customer;
    private String sheetCode;
    private Questions questions;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

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
}
