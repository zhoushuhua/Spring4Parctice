package site.zhoush.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhoush on 2018/4/10.
 */
@Aspect
public class TrackCounter {

    private Map<Integer, Integer> counter = new HashMap<>();

    @Pointcut("execution(* site.zhoush.comps.BlankDisc.play(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber) {}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        this.counter.put(trackNumber, getPlayCount(trackNumber) + 1);
    }

    // 获取次数
    public int getPlayCount(int trackNumber) {
        return this.counter.get(trackNumber) == null ? 0 :
                this.counter.get(trackNumber);
    }
}
