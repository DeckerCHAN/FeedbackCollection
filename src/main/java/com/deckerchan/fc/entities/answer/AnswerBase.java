package com.deckerchan.fc.entities.answer;

/**
 * Created by deckerchan on 22/12/16.
 */
public abstract class AnswerBase {
    private int sequence;
    private double secondUsed;

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public double getSecondUsed() {
        return secondUsed;
    }

    public void setSecondUsed(double secondUsed) {
        this.secondUsed = secondUsed;
    }
}
