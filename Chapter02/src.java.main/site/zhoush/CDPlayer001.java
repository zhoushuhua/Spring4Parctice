package site.zhoush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhoush on 2018/4/1.
 */
@Component
//@Named
public class CDPlayer001 implements MediaPlayer {

    private CompactDisc compactDisc;

    // 使用Setter的方式注入
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        // 播放
        this.compactDisc.play();
    }
}