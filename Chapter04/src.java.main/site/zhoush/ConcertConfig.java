package site.zhoush;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import site.zhoush.aop.Audience;
import site.zhoush.aop.TrackCounter;
import site.zhoush.comps.BlankDisc;
import site.zhoush.comps.CompactDisc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoush on 2018/4/10.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public CompactDisc compactDisc() {
        BlankDisc cd = new BlankDisc();
        cd.setTitle("Sgt. Pepper's lonely Hearts Club Band");
        cd.setArtist("The Beatles");
        List<String> trackList = new ArrayList<>();
        trackList.add("Sgt. Pepper's lonely Hearts Club Band");
        trackList.add("With a Little Help from My Friends");
        trackList.add("Lucky in the sky with diamonds");
        trackList.add("Getting Better");
        trackList.add("Fixing a Hole");
        cd.setTracks(trackList);

        // 返回结果
        return cd;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
