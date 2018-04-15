package site.zhoush.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by zhoush on 2018/4/5.
 */
public class MagicExistsCondition implements Condition {

    // 判断相应的环境变量是否存在
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        // 获取环境变量信息
        Environment environment = conditionContext.getEnvironment();
        return environment.containsProperty("magic");
    }
}
