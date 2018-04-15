package site.zhoush;

import org.springframework.stereotype.Component;

/**
 * Created by zhoush on 2018/3/31.
 */
// 定义为Sping组件
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    // 实现播放功能
    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
    }
}
