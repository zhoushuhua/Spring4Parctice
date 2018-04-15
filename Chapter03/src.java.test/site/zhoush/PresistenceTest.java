package site.zhoush;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.zhoush.config.PresistenceConfig;

/**
 * Created by zhoush on 2018/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PresistenceConfig.class})
@ActiveProfiles(value = {"dev"})
public class PresistenceTest {
}
