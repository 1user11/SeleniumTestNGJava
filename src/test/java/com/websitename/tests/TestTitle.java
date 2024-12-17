package com.websitename.tests;

import com.websitename.base.BaseTest;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTitle extends BaseTest {

    @Description("Verify Store Title is as expected")
    @Feature("Store Home Page")
    @Link(name = "Documentation", url = "https://clickup.com")
    @Issue("JIRA-124")
    @TmsLink("TMS-457")
    @Owner("Oksana K.")
    @Tag("Regression")
    @Test
    public void testTitle() {

        String expectedTitle= "AskOmDch – Become a Selenium automation expert!";

        Allure.step("Step 1: Validate Store Title is as expected");
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title doesn't match!");
    }
}

