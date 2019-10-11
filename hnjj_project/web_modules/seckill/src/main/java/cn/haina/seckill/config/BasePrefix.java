package cn.haina.seckill.config;

/**
 * 该类2种不同构造方法：用于继承。一个只带前缀名，一个带前缀名和过期时间。当实现public BasePrefix(String prefix)的时候，
 * 设置key的合适的有效期。
 */
public abstract class BasePrefix implements KeyPrefix {
    private int expireSeconds;
    private String prefix;
    public BasePrefix() {
    }
    public BasePrefix(String prefix) {
        //this(0, prefix);//默认使用0，不会过期
        this.expireSeconds=0;
        this.prefix=prefix;
    }
    public BasePrefix(int expireSeconds,String prefix) {
        this.expireSeconds=expireSeconds;
        this.prefix=prefix;
    }
    @Override
    public int expireSeconds() {
        return expireSeconds;
    }
    //前缀为类名:+prefix
    @Override
    public String getPrefix() {
        String className=getClass().getSimpleName();
        return className+":"+prefix;
    }

}
