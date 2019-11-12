package de.gothaer.firstmove.FirstMove;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class FirstMoveClassControlerUnitTest {
    private FirstMoveService firstMoveServiceMock = mock(FirstMoveService.class);
    private FirstMoveController classUnderTest = new FirstMoveController(firstMoveServiceMock);


    @Test
    void findOne() throws Exception
    {
        FirstMoveClass mock = new FirstMoveClass("mario", "green");
        when(firstMoveServiceMock.findById(1L)).thenReturn(mock);

        ResponseEntity<FirstMoveClass> one = classUnderTest.findOne(1L);
        assertEquals("mario", one.getBody().getName());
    }

    @Test
    void getAll() {
    }

}