package site.zhoush.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Created by zhoush on 2018/4/7.
 */
@Component
public class BlankDisc {

    private String title;
    private String artist;

    public BlankDisc(
            @Value("${disc.title}") String title,
            @Value("${disc.artist}") String artist) {
        this.title = title;
        this.artist = artist;
    }

//    public BlankDisc(
//        @Value("#{systemProperties['disc.title']}") title,
//        @Value("#{systemProperties['disc.artist']}") artist
//        ){
//        this.title = title;
//        this.artist = artist;
//    }

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
}
