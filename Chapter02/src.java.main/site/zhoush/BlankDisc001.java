package site.zhoush;

import java.util.List;

/**
 * Created by zhoush on 2018/4/1.
 */
public class BlankDisc001 implements CompactDisc {

    private String title;           // 标题
    private String artist;          //
    private List<String> tracks;    // 音乐集

    // setter | getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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


