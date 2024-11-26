package com.websitename.tests;

import com.websitename.base.BaseTest;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SomeTestExamples extends BaseTest {

    @Test
    public void testTitle() {
        String expectedTitle= "AskOmDch – Become a Selenium automation expert!";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}

