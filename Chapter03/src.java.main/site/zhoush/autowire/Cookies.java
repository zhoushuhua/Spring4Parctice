package site.zhoush.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import site.zhoush.autowire.Dessert;

/**
 * Created by zhoush on 2018/4/6.
 */
@Component
@Qualifier("cold")
public class Cookies implements Dessert {
}
