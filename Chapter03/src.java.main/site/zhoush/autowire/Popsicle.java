package site.zhoush.autowire;

import org.springframework.stereotype.Component;
import site.zhoush.autowire.special.Cold;
import site.zhoush.autowire.special.Cremy;
import site.zhoush.autowire.special.Fruity;

/**
 * Created by zhoush on 2018/4/6.
 */
@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

}