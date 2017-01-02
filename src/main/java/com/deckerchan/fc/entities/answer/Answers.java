package com.deckerchan.fc.entities.answer;

/**
 * Created by deckerchan on 23/12/16.
 */
public class Answers {
    private SingleSelectAnswer[] singleSelectAnswer;
    private MultiSelectAnswer[] multiSelectAnswer;
    private PureTextAnswer[] pureTextAnswers;
    private SelectionExtraTextAnswer[] selectionExtraTextAnswer;

    public SingleSelectAnswer[] getSingleSelectAnswer() {
        return singleSelectAnswer;
    }

    public void setSingleSelectAnswer(SingleSelectAnswer[] singleSelectAnswer) {
        this.singleSelectAnswer = singleSelectAnswer;
    }

    public MultiSelectAnswer[] getMultiSelectAnswer() {
        return multiSelectAnswer;
    }

    public void setMultiSelectAnswer(MultiSelectAnswer[] multiSelectAnswer) {
        this.multiSelectAnswer = multiSelectAnswer;
    }

    public PureTextAnswer[] getPureTextAnswers() {
        return pureTextAnswers;
    }

    public void setPureTextAnswers(PureTextAnswer[] pureTextAnswers) {
        this.pureTextAnswers = pureTextAnswers;
    }

    public SelectionExtraTextAnswer[] getSelectionExtraTextAnswer() {
        return selectionExtraTextAnswer;
    }

    public void setSelectionExtraTextAnswer(SelectionExtraTextAnswer[] selectionExtraTextAnswer) {
        this.selectionExtraTextAnswer = selectionExtraTextAnswer;
    }
}
