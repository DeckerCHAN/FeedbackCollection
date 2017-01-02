package com.deckerchan.fc.entities.question;

/**
 * Created by deckerchan on 20/12/16.
 */
public final class MultiSelectionQuestion extends QuestionBase {
    private String[] options;

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}
