package site.zhoush.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import site.zhoush.domain.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by zhoush on 2018/4/15.
 */
//@RunWith(SpringJUnit4ClassRunner.class)

public class HomeControllerTest {

    @Test
    public void testHomePage() {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        try {
            mockMvc.perform(get("/")).andExpect(view().name("home"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
