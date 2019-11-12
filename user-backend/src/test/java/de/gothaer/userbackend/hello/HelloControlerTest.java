package de.gothaer.userbackend.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControlerTest {

    private HelloControler classUnderTest = new HelloControler();
    @Test
    void hello()
    {
        String hello = classUnderTest.hello();
        assertEquals(  "Hello World", hello);
    }

    @Test
    void helloname()
    {
        String result = classUnderTest.helloname("Mario");
        assertEquals("Hello Mario", result);
    }
}