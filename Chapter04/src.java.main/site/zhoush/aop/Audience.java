package site.zhoush.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by zhoush on 2018/4/10.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* site.zhoush.comps.Performance.perform(..))")
    public void perfomance(){}

    // 被通知方法执行之前调用
//    @Before("execution(* site.zhoush.comps.Performance.perform(..))")
    @Before("perfomance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    // 被通知方法执行之前调用
//    @Before("execution(* site.zhoush.comps.Performance.perform(..))")
    @Before("perfomance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    // 被通知方法正常执行完成后调用
//    @AfterReturning("execution(* site.zhoush.comps.Performance.perform(..))")
    @AfterReturning("perfomance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP");
    }

    // 被通知方法出现异常时调用
//    @AfterThrowing("execution(* site.zhoush.comps.Performance.perform(..))")
    @AfterThrowing("perfomance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
