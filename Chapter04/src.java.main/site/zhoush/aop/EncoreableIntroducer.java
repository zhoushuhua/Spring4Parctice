package site.zhoush.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import site.zhoush.comps.DefaultEncoreable;
import site.zhoush.comps.Encoreable;

/**
 * Created by zhoush on 2018/4/11.
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "site.zhoush.comps.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
