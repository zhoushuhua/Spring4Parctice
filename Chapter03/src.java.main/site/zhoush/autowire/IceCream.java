package site.zhoush.autowire;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import site.zhoush.autowire.Dessert;
import site.zhoush.autowire.special.Cold;
import site.zhoush.autowire.special.Cremy;

/**
 * Created by zhoush on 2018/4/6.
 */
@Component
@Cold
@Cremy
public class IceCream implements Dessert {

}