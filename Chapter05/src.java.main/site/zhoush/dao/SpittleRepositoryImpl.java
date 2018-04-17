package site.zhoush.dao;

import org.springframework.stereotype.Repository;
import site.zhoush.domain.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhoush on 2018/4/15.
 */
@Repository
public class SpittleRepositoryImpl implements SpittleRepository {

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = new ArrayList<>();
        list.add(new Spittle("Spittles go fourth", new Date(), 0.0d, 0.0d));
        list.add(new Spittle("Spittles spittle spittle", new Date(), 0.0d, 0.0d));
        list.add(new Spittle("Here's another spittle", new Date(), 0.0d, 0.0d));
        list.add(new Spittle("Hello World! The first ever spittle!", new Date(), 0.0d, 0.0d));
        return list;
    }

    @Override
    public Spittle findOne(long spittle_id) {
        return null;
    }
}
