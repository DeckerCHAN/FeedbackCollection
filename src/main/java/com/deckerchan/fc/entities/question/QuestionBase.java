package com.deckerchan.fc.entities.question;

/**
 * Created by deckerchan on 20/12/16.
 */
public abstract class QuestionBase {
    private String title;
    private int sequence;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

}
