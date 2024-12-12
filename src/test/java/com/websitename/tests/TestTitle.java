package com.websitename.tests;

import com.websitename.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTitle extends BaseTest {

    @Test
    public void testTitle() {
        String expectedTitle= "AskOmDch – Become a Selenium automation expert!";

        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title doesn't match!");
    }
}

