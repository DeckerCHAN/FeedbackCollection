package com.deckerchan.fc.entities.answer;

/**
 * Created by deckerchan on 22/12/16.
 */
public class SingleSelectAnswer extends AnswerBase {
    private int selected;

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }
}
