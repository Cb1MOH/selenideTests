package com.selenidTestsForWeb;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class LandingPage {
    @Test
    /*
    This test check if user lands correct Landing page
     */
    public void checkLandingPageOpens() {
        open("https://freewebsitetemplates.com/");
        String currentUrl = url();
        currentUrl.equals(url());
        close();
    }

    @Test
    /*
    This test checks basic elements on landing page
     */
    public void checkBasicElementsOnLandingPage() {
        open("https://freewebsitetemplates.com/");
        $("#loginBar").should(Condition.exist);
        $("#headerProxy").should(Condition.exist);
        $("#content").should(Condition.exist);
        $("#PageNav").should(Condition.exist);
        $("#pageDescription").should(Condition.exist);
        $("#footer").should(Condition.exist);
        close();
    }

    @Test
    public void checkLoginFormBasicElements() {
        open("https://freewebsitetemplates.com/");
        $("#loginBarHandle > label").click();
        $("#login > div").shouldBe(Condition.visible);
        $("#login > div > dl:nth-child(1) > dt > label").shouldHave(Condition.text("Your name or email address:"));
        $("#LoginControl").should(Condition.exist);
        $("#LoginControl").shouldHave(Condition.text("Do you already have an account?"));
        $("#ctrl_password").should(Condition.exist);




    }


    @Test
    /*
    Test basic element of random element in the grid of templates on landing page.
     */
    public void checkTileBasicElements() {
        open("https://freewebsitetemplates.com/");
        int chooseElement = (int) Math.random() * ((11 - 1) + 1) + 1;
        $("#fwtTemplatesList").should(Condition.exist);
        $("#fwtTemplatesList > ul > li:nth-child("+chooseElement+")").should(Condition.exist).click();
        $("#fwtTemplatesList > ul > li:nth-child("+chooseElement+") > a > span").should(Condition.exist);
        $("#fwtTemplatesList > ul > li:nth-child("+chooseElement+") > a > img").should(Condition.exist);
        $("#fwtTemplatesList > ul > li:nth-child("+chooseElement+") > a > img").shouldHave(Condition.attribute("src"));
        $("#fwtTemplatesList > ul > li:nth-child("+chooseElement+") > div.option").should(Condition.exist);



    }


}
