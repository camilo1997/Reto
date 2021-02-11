#Autor: camilo lopera monsalve
  @stories
  Feature: registro en utest
      Como usuario, quiero registar mis datos en utest
    @Scenario2
    Scenario: Registro de datos
    Given que un usuario quiere registrar sus datos en utest

    When  el usuario registre sus datos
    #|srtName  |srtLastName|srtEmail               |srtMonth|srtDay|srtYear|srtLanguage|srtZip| srtCountry|srtSystem|srtVersion     |srtLanguages|srtMobil |srtModel|srtSystemMobile|srtPassword | srtConfirmPassword|
    #|camilo   |lopera     |camilolopera1@gmail.com|August  |29    |1997   |Spanish    |050015|Colombia   |Windows  |Windows 10 Home|Spanish     |xiaomi   |MI 9T   |Android 10     |A123789456a*|A123789456a*       |
    Then registro sus datos https://www.utest.com/welcome?from=signup
    #| srtConfirm |
    #|We are excited that you have found your way to uTest - home of the largest community of digital freelance software testers in the world! First, please check your email inbox to confirm your email address and complete your uTest registration.|
