package com.deckerchan.fc;

import com.deckerchan.fc.entities.SurveySheet;
import com.deckerchan.fc.entities.question.*;
import com.deckerchan.fc.utils.Serilization;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.nio.charset.Charset;

/**
 * Created by deckerchan on 21/12/16.
 */
public class EntryPoint {
    public static void main(String[] args) throws Exception {


        SingleSelectionQuestion q1 = new SingleSelectionQuestion();
        q1.setSequence(1);
        q1.setTitle("This question 1");
        q1.setOptions(new String[]{"opt1", "opt2", "opt3"});

        MultiSelectionQuestion q2 = new MultiSelectionQuestion();
        q2.setSequence(2);
        q2.setTitle("This is question 2");
        q2.setOptions(new String[]{"opt1", "opt2", "opt3", "opt4"});

        MultiSelectionQuestion q3 = new MultiSelectionQuestion();
        q3.setSequence(3);
        q3.setTitle("This is question 3");
        q3.setOptions(new String[]{"opt1", "opt2", "opt3", "opt4"});

        PureTextQuestion q4 = new PureTextQuestion();
        q4.setSequence(4);
        q4.setTitle("This is question 4");

        SelectionExtraTextQuestion q5 = new SelectionExtraTextQuestion();
        q5.setSequence(5);
        q5.setTitle("This is question 4, which is a selection question but able to have a custom text answer.");

        Questions questions = new Questions();
        questions.setSingleSelectionQuestion(new SingleSelectionQuestion[]{q1});
        questions.setMultiSelectionQuestion(new MultiSelectionQuestion[]{q2,q3});
        questions.setPureTextQuestion(new PureTextQuestion[]{q4});
        questions.setSelectionExtraTextQuestion(new SelectionExtraTextQuestion[]{q5});


        SurveySheet sheet = new SurveySheet();
        sheet.setSheetCode("CHN");
        sheet.setQuestions(questions);


        FileUtils.writeStringToFile(new File("sheet.json"), Serilization.toJson(sheet), Charset.forName("utf-8"));
    }
}
