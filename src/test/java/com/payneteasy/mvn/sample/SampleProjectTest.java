package com.payneteasy.mvn.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class SampleProjectTest {
    @Test
    public void getHello() throws Exception {
        assertEquals("hello", new SampleProject().getHello());
    }

}