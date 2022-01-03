package com.sb.iams;

import org.junit.Assert;
import org.junit.Test;

public class IAMSApplicationTest {

    @Test
    public void constructGreetingTest() {
        String greeting = IAMSApplication.constructGreeting("Sanath");
        Assert.assertEquals("Hello Sanath", greeting);
    }
}
