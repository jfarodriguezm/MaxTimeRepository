#Autor: Jhonatan Fabian Rodriguez Mahecha

@stories
Feature: MaxTime Report
  As a user, I want to make the daily report in MaxTime

  @scenario1
  Scenario Outline: Create report
    Given than Jhon is already login in MaxTime
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When he create a report
      | strHourType   | strService   | strActivity   | strHours   | strComments   |
      | <strHourType> | <strService> | <strActivity> | <strHours> | <strComments> |
    Then the platform show the message <strMessage>

    Examples:
      | strUser     | strPassword  | strHourType | strService                 | strActivity     | strHours | strComments              | strMessage  |
      | jrodriguezm | Testing2022* | H. Choucair | Pruebas Generales Clásicas | FORMACIÓN GUÍAS | 9        | Formación Automatización | Reporte Dia |
