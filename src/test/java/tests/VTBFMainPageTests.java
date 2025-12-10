package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class VTBFMainPageTests extends TestBase {

    @Test
    void OpenAboutCompanyTest() {

        open("/");

        $(byText("О компании")).click();
        $(".b-section").shouldHave(text("О компании"),
                text("Брошюра о ВТБ Факторинг"));
        sleep(1000);
    }


    @Test
    void OpenKBTest() {

        open("/");

        $(byText("Крупному бизнесу")).click();
        $(byText("Финансирование закупок")).click();
        sleep(1000);
    }

    @Test
    void OpenСasesTest() {

        open("/");

        $(byText("Смотреть все")).click();
        $(".b-section").shouldHave(text("Кейсы"));
        sleep(1000);
    }

    @Test
    void OpenСareerFooterTest() {

        open("/");

        $(byText("Карьера")).click();
        $(".b-section").shouldHave(text("Работа у нас"));
        sleep(1000);
    }

}
