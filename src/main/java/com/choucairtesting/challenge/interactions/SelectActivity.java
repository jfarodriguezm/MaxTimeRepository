package com.choucairtesting.challenge.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectActivity implements Interaction {

    private Target list;
    private String option;

    public SelectActivity(Target list, String option) {
        this.list = list;
        this.option = option;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> listObjets = list.resolveFor(actor).findElements(By.xpath("//td[span]"));
        for (int i = 0; i < listObjets.size(); i++) {
            if (listObjets.get(i).getText().equals(option)) {
                listObjets.get(i).click();
                break;
            }
        }
    }

    public static SelectActivity theList(Target list, String option) {
        return new SelectActivity(list, option);
    }
}
