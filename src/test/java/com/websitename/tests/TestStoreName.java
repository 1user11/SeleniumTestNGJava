package com.websitename.tests;

import com.websitename.base.BaseTest;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.testng.Tag;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStoreName extends BaseTest {

    @Description("Verify Store Name is as expected")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Store Home Page")
    //@Story
    @Link(name = "Documentation", url = "https://clickup.com")
    @Issue("JIRA-123")
    @TmsLink("TMS-456")
    @Owner("Oksana K.")
    @Tag("Regression")
    //@Tag("Smoke")
    @Test
    public void testStoreName() {
        Allure.step("Step 1: Get text from the website logo");
        String websiteName = driver.findElement(By.xpath("//h1/a[@href='https://askomdch.com/']")).getText();

        Allure.step("Step 2: Validate Store Name is as expected");
        Assert.assertEquals(websiteName,"AskOmDch", "Store Name doesn't match!");
    }
}
