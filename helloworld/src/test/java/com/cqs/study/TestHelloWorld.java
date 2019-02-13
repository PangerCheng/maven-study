package com.cqs.study;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelloWorld {
    @Test
    public void testSayHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHelloWorld();
        assertEquals("Hello Maven World",result);

    }
}
