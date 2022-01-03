package com.sb.iams;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest{

    @Test
    public void constructGreetingTest(){
        String greeting = HelloWorld.constructGreeting("Venkat");
        Assert.assertEquals("Hello Venkat", greeting);
    }
}
