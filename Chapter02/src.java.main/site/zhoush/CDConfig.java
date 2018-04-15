package site.zhoush;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.zhoush.CompactDisc;
import site.zhoush.SgtPeppers;

/**
 * Created by zhoush on 2018/4/4.
 */
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
