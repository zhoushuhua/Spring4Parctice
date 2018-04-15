package site.zhoush.comps;

/**
 * Created by zhoush on 2018/4/11.
 */
public class CriticismEngineImpl implements CriticismEngine{
    @Override
    public String getCriticism() {
        int idx = (int)Math.random() * criticismPool.length;
        return criticismPool[idx];
    }

    private String[] criticismPool;
    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
