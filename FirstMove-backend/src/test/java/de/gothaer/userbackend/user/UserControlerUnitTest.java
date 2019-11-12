package de.gothaer.userbackend.user;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class UserControlerUnitTest {
    private UserService userServiceMock = mock(UserService.class);
    private UserController classUnderTest = new UserController(userServiceMock);


    @Test
    void findOne() throws Exception
    {
        User mock = new User("mario", "green");
        when(userServiceMock.findById(1L)).thenReturn(mock);

        ResponseEntity<User> one = classUnderTest.findOne(1L);
        assertEquals("mario", one.getBody().getName());
    }

    @Test
    void getAll() {
    }

}