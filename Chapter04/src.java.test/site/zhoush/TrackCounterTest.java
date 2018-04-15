package site.zhoush;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import site.zhoush.aop.TrackCounter;
import site.zhoush.comps.CompactDisc;

/**
 * Created by zhoush on 2018/4/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConcertConfig.class})
public class TrackCounterTest {

//    @Rule
//    public SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTrackCounter() {
        compactDisc.play(1);
        compactDisc.play(2);
        compactDisc.play(2);
        compactDisc.play(3);
        compactDisc.play(3);
        compactDisc.play(4);

        Assert.assertEquals(1, trackCounter.getPlayCount(1));
        Assert.assertEquals(2, trackCounter.getPlayCount(2));
        Assert.assertEquals(2, trackCounter.getPlayCount(3));
        Assert.assertEquals(1, trackCounter.getPlayCount(4));
    }
}
