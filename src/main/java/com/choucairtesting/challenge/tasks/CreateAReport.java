package com.choucairtesting.challenge.tasks;

import com.choucairtesting.challenge.interactions.Select;
import com.choucairtesting.challenge.interactions.SelectActivity;
import com.choucairtesting.challenge.model.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.choucairtesting.challenge.userinterface.CreateAReportPage.*;
import static com.choucairtesting.challenge.userinterface.CreateAReportPage.ACTIVITY_SELECT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class CreateAReport implements Task {

    private List<Data> data;

    public CreateAReport(List<Data> data) {
        this.data = data;
    }

    public static CreateAReport with(List<Data> data) {
        return Tasks.instrumented(CreateAReport.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(REPORT_BUTTON, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(REPORT_BUTTON),
                WaitUntil.the(DAY_BUTTON, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(DAY_BUTTON),
                WaitUntil.the(NEW_REPORT_BUTTON, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(NEW_REPORT_BUTTON),
                Click.on(SELECT_PROJECT_BUTTON),
                WaitUntil.the(PROJECT_BUTTON, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(PROJECT_BUTTON),
                WaitUntil.the(HOUR_TYPE_BUTTON, isPresent()).forNoMoreThan(10).seconds(),
                Click.on(HOUR_TYPE_BUTTON),
                Select.theList(HOUR_TYPE_SELECT,data.get(0).getStrHourType())
        );
        actor.attemptsTo(Click.on(SELECT_SERVICE_BUTTON),
                WaitUntil.the(SEARCH_SERVICE, isPresent()).forNoMoreThan(10).seconds(),
                Enter.theValue(data.get(0).getStrService()).into(SEARCH_SERVICE).thenHit(Keys.ENTER),
                WaitUntil.the(TABLE_SERVICE, isPresent()).forNoMoreThan(10).seconds(),
                SelectActivity.theList(TABLE_SERVICE, data.get(0).getStrService()),
                Click.on(ACTIVITY_BUTTON),
                Select.theList(ACTIVITY_SELECT,data.get(0).getStrActivity()),
                Enter.theValue(data.get(0).getStrHours()).into(INPUT_HOURS),
                Enter.theValue(data.get(0).getStrComments()).into(INPUT_COMMENTS),
                Click.on(SAVE_AND_CLOSE_BUTTON)
        );

    }
}
