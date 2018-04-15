package site.zhoush.dao;

import site.zhoush.domain.Spittle;

import java.util.List;

/**
 * Created by zhoush on 2018/4/15.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long spittle_id);
}
