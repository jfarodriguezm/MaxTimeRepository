package com.choucairtesting.challenge.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class CreateAReportPage extends PageObject {
    public static final Target REPORT_BUTTON = Target.the("button to report")
            .located(By.xpath("//div[@id='Vertical_NC']//li[@id='Vertical_NC_NB_I0i0_']"));
    public static final Target DAY_BUTTON = Target.the("button to select day")
            .located(By.id("Vertical_v1_LE_v2_tccell0_0"));
    public static final Target NEW_REPORT_BUTTON = Target.the("button to create a report")
            .located(By.xpath("//div[@class='NestedFrame']//li[@title='Nuevo Detalle Reporte Dia']"));
    public static final Target SELECT_PROJECT_BUTTON = Target.the("button to select the project")
            .located(By.xpath("(//table[@title='Buscar']//td)[1]"));
    public static final IFrame FRAME = IFrame.withPath(By.xpath("//div[@id='UPPopupWindowControl']//iframe"));
    public static final Target PROJECT_BUTTON = Target.the("button to select the project")
            .inIFrame(FRAME)
            .located(By.xpath("(//table[@id='Dialog_Table1']//td[@class='dxgv'])[1]"));
    public static final Target HOUR_TYPE_BUTTON = Target.the("button to select the hour type")
            .located(By.xpath("(//img[@class='dxEditors_edtDropDown_Office2010Blue'])[1]"));
    public static final Target HOUR_TYPE_SELECT = Target.the("where do we select the hour type")
            .located(By.xpath("(//table[@class='dxeListBox_Office2010Blue'])[1]"));
    public static final Target SELECT_SERVICE_BUTTON = Target.the("button to select the service")
            .located(By.xpath("(//table[@title='Buscar']//td)[3]"));

    public static final IFrame FRAME_SERVICE = IFrame.withPath(By.xpath("//div[@id='UPPopupWindowControl']//iframe"));
    public static final Target SEARCH_SERVICE = Target.the("where do we search the services")
            .inIFrame(FRAME_SERVICE)
            .located(By.id("Dialog_SearchActionContainer_Menu_ITCNT0_xaf_a0_Ed_I"));
    public static final Target BUTTON_SEARCH_SERVICE = Target.the("button to search the services")
            .inIFrame(FRAME_SERVICE)
            .located(By.xpath("(//table[@title='Filtro objetos de texto']//td//div)[2]"));
    public static final Target TABLE_SERVICE = Target.the("where do we select the service")
            .inIFrame(FRAME_SERVICE)
            .located(By.xpath("//table[@class='dxgvTable_Office2010Blue']"));
    public static final Target INPUT_ACTIVITY = Target.the("where do we write the activity")
            .located(By.xpath("(//input[@class='dxeEditArea_Office2010Blue dxeEditAreaSys '])"));
    public static final Target ACTIVITY_BUTTON = Target.the("button to select the activity")
            .located(By.xpath("(//img[@class='dxEditors_edtDropDown_Office2010Blue'])[2]"));
    public static final Target ACTIVITY_SELECT = Target.the("where do we select the hour type")
            .located(By.xpath("(//table[@class='dxeListBox_Office2010Blue'])[2]"));
    public static final Target INPUT_HOURS = Target.the("where do we write the hours")
            .located(By.id("Vertical_v6_MainLayoutEdit_xaf_l182_xaf_dviHoras_Edit_I"));
    public static final Target INPUT_COMMENTS = Target.the("where do we write the comments")
            .located(By.id("Vertical_v6_MainLayoutEdit_xaf_l207_xaf_dviComentario_Edit_I"));
    public static final Target SAVE_AND_CLOSE_BUTTON = Target.the("Button ")
            .located(By.id("Vertical_EditModeActions2_Menu_DXI1_T"));
    public static final Target LABEL_MESSAGE = Target.the("Label to confirm return to home page")
            .located(By.xpath("(//div[@class='Layout LayoutViewMode']//tr//td)[1]"));
}
