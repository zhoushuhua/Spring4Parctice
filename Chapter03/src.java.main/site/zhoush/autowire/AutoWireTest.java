package site.zhoush.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import site.zhoush.autowire.special.Cold;
import site.zhoush.autowire.special.Cremy;
import site.zhoush.autowire.special.Fruity;

/**
 * Created by zhoush on 2018/4/6.
 */
@Component
public class AutoWireTest {

    private Dessert dessert;

    @Autowired
    @Cold
    @Fruity
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

}
