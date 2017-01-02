package com.deckerchan.fc.entities;

import com.deckerchan.fc.entities.answer.Answers;

/**
 * Created by deckerchan on 23/12/16.
 */
public class SurveyReport {
    private String sheetCode;
    private Customer customer;
    private Answers answers;

    public String getSheetCode() {
        return sheetCode;
    }

    public void setSheetCode(String sheetCode) {
        this.sheetCode = sheetCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Answers getAnswers() {
        return answers;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }
}
