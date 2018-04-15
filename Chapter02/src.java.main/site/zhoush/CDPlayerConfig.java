package site.zhoush;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by zhoush on 2018/3/31.
 */
@Configuration
@Import(value = {CDConfig.class})
//@ComponentScan(basePackages = {"site.zhoush"})      // 默认扫描当前目录和目录下面的子包
public class CDPlayerConfig {

    // 创建Bean
    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}