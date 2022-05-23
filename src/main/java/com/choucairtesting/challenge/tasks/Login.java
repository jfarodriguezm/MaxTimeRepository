package com.choucairtesting.challenge.tasks;

import com.choucairtesting.challenge.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.choucairtesting.challenge.userinterface.LoginPage.*;

public class Login implements Task {

    private List<Data> data;

    public Login(List<Data> data) {
        this.data = data;
    }

    public static Login onThePage(List<Data> data) {
        return Tasks.instrumented(Login.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrUser()).into(INPUT_USER),
                Enter.theValue(data.get(0).getStrPassword()).into(INPUT_PASSWORD),
                Click.on(ENTER_BUTTON)
        );

    }
}
