package de.gothaer.firstmove.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMoveControllerTest {

    private FirstMoveController classUnderTest = new FirstMoveController();
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