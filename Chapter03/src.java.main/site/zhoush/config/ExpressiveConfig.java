package site.zhoush.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import site.zhoush.domain.BlankDisc;

/**
 * Created by zhoush on 2018/4/7.
 */
@Configuration
@PropertySource(value = {"classpth:expressive.properties"})
public class ExpressiveConfig {

    @Autowired
    private Environment environment;

    public BlankDisc newBlankDisc() {
        return new BlankDisc(
          environment.getProperty("disc.title"),
            environment.getProperty("disc.artist")
        );
    }
}
