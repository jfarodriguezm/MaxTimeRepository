package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm the login")
            .located(By.id("Logon_PopupActions_Menu_DXI0_T"));
}
