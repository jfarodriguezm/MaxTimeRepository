package com.choucairtesting.challenge.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.choucairtesting.challenge.userinterface.CreateAReportPage.LABEL_MESSAGE;

public class TheAswer implements Question<Boolean> {

    private String question;

    public TheAswer(String question) {
        this.question = question;
    }

    public static TheAswer toThe(String question) {
        return new TheAswer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = true;
        String answer = Text.of(LABEL_MESSAGE).viewedBy(actor).asString();
        if(question.equals(answer)){
            result = true;
        }else {
            result = false;
        }
        return result;

    }
}
