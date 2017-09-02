package com.codebind;

import static org.junit.Assert.*;

public class AppTest {
    @org.junit.Test
    public void test1() throws Exception {
        App ap=new App();
        assertEquals("Welcom to maven demo",ap.test());
    }

}