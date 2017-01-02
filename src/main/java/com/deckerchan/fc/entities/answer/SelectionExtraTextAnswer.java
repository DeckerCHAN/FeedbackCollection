package com.deckerchan.fc.entities.answer;

/**
 * Created by deckerchan on 23/12/16.
 */
public class SelectionExtraTextAnswer extends AnswerBase {
    private int selected;
    private String answer;

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
