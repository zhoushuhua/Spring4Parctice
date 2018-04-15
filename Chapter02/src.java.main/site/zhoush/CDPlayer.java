package site.zhoush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhoush on 2018/4/1.
 */
@Component
//@Named
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

//    @Inject
//    public CDPlayer(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

    @Autowired
    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

//    @Autowired
//    public void setCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }insert

//    @Autowired(required = false)
//    public void insertCompactDisc(CompactDisc compactDisc) {
//        this.compactDisc = compactDisc;
//    }

    @Override
    public void play() {
        // 播放
        this.compactDisc.play();
    }
}