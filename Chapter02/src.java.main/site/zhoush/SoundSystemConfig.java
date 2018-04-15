package site.zhoush;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhoush on 2018/4/4.
 */
@Configuration
//@Import(value = {CDConfig.class, CDPlayerConfig.class})
@Import(value = {CDPlayerConfig.class})
@ImportResource(locations = {"classpath:applicationi-contenxt.xml"})
public class SoundSystemConfig {
}
