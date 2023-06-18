package com.neznatnov;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest extends TestBase {

    @Test
    public void visibleSignUp() {
        open("");
        $(".HeaderMenu-link--sign-up").shouldBe(Condition.visible);
    }
}
