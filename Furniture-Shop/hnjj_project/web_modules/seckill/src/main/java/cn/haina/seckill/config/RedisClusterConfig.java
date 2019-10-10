package cn.haina.seckill.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;
import java.util.ArrayList;
import java.util.List;

@Data
@Configuration
@ConfigurationProperties("redis.cluster")
public class RedisClusterConfig {
    List<Integer> ports;
    String host;
    JedisPoolConfig poolConfig;

    @Bean
    RedisClusterConfiguration redisClusterConfiguration(){
        System.err.println("=============="+ports.size());
        RedisClusterConfiguration configuration=new RedisClusterConfiguration();
        List<RedisNode> nodes=new ArrayList<>();
        for (Integer port : ports){
            System.err.println("**********"+ports.size());
            nodes.add(new RedisNode(host,port));
        }
        System.err.println(nodes);
        configuration.setPassword(RedisPassword.of("123456"));
        configuration.setClusterNodes(nodes);
        return configuration;
    }

    @Bean
    RedisConnectionFactory redisConnectionFactory(){
        JedisConnectionFactory factory=new JedisConnectionFactory(redisClusterConfiguration(),poolConfig);
        return factory;
    }

    @Bean
    RedisTemplate redisTemplate(){
        RedisTemplate redisTemplate=new StringRedisTemplate();
        redisTemplate.setConnectionFactory(redisConnectionFactory());
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
        return redisTemplate;
    }

    @Bean
    StringRedisTemplate stringRedisTemplate(){
        StringRedisTemplate stringRedisTemplate=new StringRedisTemplate(redisConnectionFactory());
        stringRedisTemplate.setKeySerializer(new StringRedisSerializer());
        stringRedisTemplate.setValueSerializer(new StringRedisSerializer());
        return stringRedisTemplate;
    }
}
