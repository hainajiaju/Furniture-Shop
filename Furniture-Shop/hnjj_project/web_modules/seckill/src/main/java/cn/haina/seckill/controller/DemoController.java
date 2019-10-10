package cn.haina.seckill.controller;

import cn.haina.entity.Seckill;
import cn.haina.seckill.service.SeckillService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    SeckillService seckillService;

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("/index")
    public String shangpin(){
        return "xiangqing";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(){
        Seckill seckill=new Seckill();
        seckill.setSpuId(2);
        seckill.setPrice(200.0);
        seckill.setNumber(40);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            seckill.setBeginDate(simpleDateFormat.parse("2019-10-10 19:20:00"));
            seckill.setEndDate(simpleDateFormat.parse("2019-10-10 20:20:00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        seckill.setContent("椅子");
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("seckill_aaa",JSON.toJSONStringWithDateFormat(seckill,"yyyy-MM-dd HH:mm:ss"));
        seckillService.insert(seckill);
        return "缓存预热成功";
    }

}
