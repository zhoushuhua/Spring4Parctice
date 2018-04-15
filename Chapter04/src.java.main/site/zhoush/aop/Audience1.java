package site.zhoush.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by zhoush on 2018/4/10.
 */
@Aspect
public class Audience1 {

    @Pointcut("execution(* site.zhoush.comps.Performance.perform(..))")
    public void perfomance(){}

    @Around("perfomance()")
    public void watchPerfomance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("CLAP CLAP CLAP");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
