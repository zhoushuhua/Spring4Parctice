package site.zhoush.dao;

import site.zhoush.domain.Spittle;
import site.zhoush.domain.Spittler;

import java.util.List;

/**
 * Created by zhoush on 2018/4/15.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long spittle_id);
    Spittler save(Spittler spittler);
    Spittler findByUesrName(String username);
}
