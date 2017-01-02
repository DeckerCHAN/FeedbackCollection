package com.deckerchan.fc.entities.question;

/**
 * Created by deckerchan on 22/12/16.
 */
public class Questions {
    private SingleSelectionQuestion[] singleSelectionQuestion;
    private MultiSelectionQuestion[] multiSelectionQuestion;
    private PureTextQuestion[] pureTextQuestion;
    private SelectionExtraTextQuestion[] selectionExtraTextQuestion;

    public SingleSelectionQuestion[] getSingleSelectionQuestion() {
        return singleSelectionQuestion;
    }

    public void setSingleSelectionQuestion(SingleSelectionQuestion[] singleSelectionQuestion) {
        this.singleSelectionQuestion = singleSelectionQuestion;
    }

    public MultiSelectionQuestion[] getMultiSelectionQuestion() {
        return multiSelectionQuestion;
    }

    public void setMultiSelectionQuestion(MultiSelectionQuestion[] multiSelectionQuestion) {
        this.multiSelectionQuestion = multiSelectionQuestion;
    }

    public PureTextQuestion[] getPureTextQuestion() {
        return pureTextQuestion;
    }

    public void setPureTextQuestion(PureTextQuestion[] pureTextQuestion) {
        this.pureTextQuestion = pureTextQuestion;
    }

    public SelectionExtraTextQuestion[] getSelectionExtraTextQuestion() {
        return selectionExtraTextQuestion;
    }

    public void setSelectionExtraTextQuestion(SelectionExtraTextQuestion[] selectionExtraTextQuestion) {
        this.selectionExtraTextQuestion = selectionExtraTextQuestion;
    }

}
