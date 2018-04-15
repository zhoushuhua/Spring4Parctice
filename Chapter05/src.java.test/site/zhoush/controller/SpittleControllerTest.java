package site.zhoush.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import site.zhoush.dao.SpittleRepository;
import site.zhoush.domain.Spittle;

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

    @Test
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

    public List<Spittle> createSpittleList(int count) {
        List<Spittle> spittleList = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            spittleList.add(new Spittle("Spittle"+i, new Date()));
        }
        return spittleList;
    }
}
