package site.zhoush.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import site.zhoush.dao.SpittleRepository;
import site.zhoush.domain.Spittle;
import site.zhoush.domain.Spittler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Created by zhoush on 2018/4/15.
 */

public class SpittleControllerTest {

//    @Test
    public void shouldShowRecentSpittle() throws Exception {
        List<Spittle> expectedSpittles = createSpittleList(20);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);

        SpittleController spittleController = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();
        mockMvc.perform(get("/spittle"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
    }

    @Test
    public void shouldShowPageSpittle() throws Exception {
        List<Spittle> expectedSpittles = createSpittleList(50);
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findSpittles(238900, 50)).thenReturn(expectedSpittles);

        SpittleController spittleController = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(spittleController)
                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
                .build();
        mockMvc.perform(get("/spittle?max=238900&count=50"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittleList"))
                .andExpect(model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
    }

    public List<Spittle> createSpittleList(int count) {
        List<Spittle> spittleList = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            spittleList.add(new Spittle("Spittle"+i, new Date()));
        }
        return spittleList;
    }

    @Test
    public void testSpittle() throws Exception {

        Spittle spittle = new Spittle("Hello", new Date());
        SpittleRepository mockRepository = mock(SpittleRepository.class);
        when(mockRepository.findOne(12345)).thenReturn(spittle);

        SpittleController spittleController = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(spittleController).build();

        mockMvc.perform(get("/spittle/12345"))
                .andExpect(view().name("spittle"))
                .andExpect(model().attributeExists("spittle"))
                .andExpect(model().attribute("spittle", spittle));
    }

    @Test
    public void testShowRegistration() throws Exception {

        SpittleRepository spittleRepository = mock(SpittleRepository.class);
        SpittleController spittleController = new SpittleController(spittleRepository);

        MockMvc mockMvc = standaloneSetup(spittleController).build();

        mockMvc.perform(get("/spittle/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void testPostRegistration() throws Exception {
        SpittleRepository spittleRepository = mock(SpittleRepository.class);
        Spittler unsaveed = new Spittler("jbauer", "24hours", "jack", "bauer");
        Spittler saved = new Spittler(24L, "jbauer", "24hours", "jack", "bauer");
        when(spittleRepository.save(unsaveed)).thenReturn(saved);

        SpittleController spittleController = new SpittleController(spittleRepository);
        MockMvc mockMvc = standaloneSetup(spittleController).build();

        mockMvc.perform(post("/spittle/register")
                .param("firstName", "jbauer")
                .param("lastName", "24hours")
                .param("username", "jack")
                .param("password", "bauer"))
                .andExpect(redirectedUrl("/spittle/jack"))
                .andExpect(model().attributeExists("spittler"));
//                .andExpect(model().attribute("spittler", saved));

//        verify(spittleRepository, atLeastOnce()).save(unsaveed);
    }

    @Test
    public void testShowSpittlerProfile() throws Exception {

        Spittler spittler = new Spittler("test00", "test01", "test02", "123456");
        SpittleRepository spittleRepository = mock(SpittleRepository.class);
        when(spittleRepository.findByUesrName("test02")).thenReturn(spittler);

        SpittleController spittleController = new SpittleController(spittleRepository);


        MockMvc mockMvc = standaloneSetup(spittleController).build();

        mockMvc.perform(get("/spittle/spittler/test02"))
                .andExpect(view().name("profile"))
                .andExpect(model().attributeExists("spittler"))
                .andExpect(model().attribute("spittler", spittler));
    }
}
