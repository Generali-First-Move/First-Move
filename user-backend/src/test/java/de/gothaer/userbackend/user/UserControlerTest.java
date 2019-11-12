package de.gothaer.userbackend.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UserControlerTest {
    @MockBean
    private UserService userService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAll() {
    }

    @Test
    void findOne() throws Exception
    {
        mockMvc.perform(get("/api/cats/1"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Julia")));
    }

    @Test
    void updateOne() throws Exception
    {

    }

    @Test
    void addcat()
    {

    }
}