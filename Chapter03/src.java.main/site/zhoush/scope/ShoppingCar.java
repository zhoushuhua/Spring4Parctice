package site.zhoush.scope;

import org.springframework.aop.framework.ProxyConfig;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * 会话级作用域
 * Created by zhoush on 2018/4/6.
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)       // 以生成目标类扩展的方式创建代理
public class ShoppingCar {
}
