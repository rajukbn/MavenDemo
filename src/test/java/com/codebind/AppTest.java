package com.codebind;

import static org.junit.Assert.*;

public class AppTest {
    public void stringtest() throws Exception {
        App ap=new App();
        assertEquals("Welcom to mavendemo",ap.stringtest());
    }
    @org.junit.Test
    public void test1() throws Exception {
        App ap=new App();
        assertEquals("Welcom to maven Demo",ap.test());
    }

}
