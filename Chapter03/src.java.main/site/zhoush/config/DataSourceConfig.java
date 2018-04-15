package site.zhoush.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.activation.DataSource;

/**
 * 将Profile配置在一个配置类中
 */
@Configuration
public class DataSourceConfig {

    /**
     * 开发环境DataSource
     * @return
     */
    @Bean(destroyMethod = "shutdown")
    @Profile("dev")
    public javax.sql.DataSource embeddedDataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:init-data.sql")
                .build();
    }

    /**
     * 生产环境DataSource
     * @return
     */
    @Bean
    @Profile("prod")
    public DataSource dataSource() {
        JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);

        // 返回DataSource
        return (DataSource)jndiObjectFactoryBean.getObject();
    }
}
