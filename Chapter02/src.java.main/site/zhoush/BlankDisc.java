package site.zhoush;

import java.util.List;

/**
 * Created by zhoush on 2018/4/1.
 */
public class BlankDisc implements CompactDisc {

    private String title;           // 标题
    private String artist;          //
    private List<String> tracks;    // 音乐集

    // 构造函数
    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public BlankDisc(String title) {
        this(title, null, null);
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    // 播放
    @Override
    public void play() {
        System.out.print("Playing " + title + " by " + artist);
        for(String track : tracks) {
            System.out.println("-Track：" + track);
        }
    }
}


