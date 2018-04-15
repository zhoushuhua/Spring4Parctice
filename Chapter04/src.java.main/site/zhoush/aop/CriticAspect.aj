package site.zhoush.aop;

import site.zhoush.comps.CriticismEngine;

/**
 * Created by zhoush on 2018/4/11.
 */
public aspect CriticAspect {
    public CriticAspect(){}

    // 定义切点
    pointcut performace():execution(* site.zhoush.comps.Performance.perform(..));

    after() : performace() {
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;
    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
