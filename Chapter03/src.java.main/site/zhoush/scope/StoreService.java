package site.zhoush.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by zhoush on 2018/4/6.
 */
@Component
public class StoreService {

    private ShoppingCar shoppingCar;

    @Autowired
    public void setShoppingCar(ShoppingCar shoppingCar) {
        this.shoppingCar = shoppingCar;
    }
}
