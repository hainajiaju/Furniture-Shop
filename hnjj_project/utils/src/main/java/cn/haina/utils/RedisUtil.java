package cn.haina.utils;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import java.util.List;

/**
 * redis辅助类
 */
@Component
public class RedisUtil {
    @Resource
    JedisPool jedisPool;
    //存值并返回最新五条
    public List<String> setDetails(String keys,String json){
        Jedis jedis = jedisPool.getResource();
        jedis.lrem(keys,1,json);
        jedis.lpush(keys,json);
        jedis.ltrim(keys,0,4);
        List<String> lrange = jedis.lrange(keys, 0, 4);
        return lrange;
    }
    //取值方法
    public String get(String key){
        Jedis jedis = jedisPool.getResource();
        String s = jedis.get(key);
        return s;
    }
    //存值方法
    public void set(String key,String value){
        Jedis jedis = jedisPool.getResource();
        jedis.set(key,value);
    }
}
