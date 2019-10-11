package cn.haina.seckill.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqSender {
    private static Logger log= LoggerFactory.getLogger(RabbitmqSender.class);

    @Autowired
    AmqpTemplate amqpTemplate;
    /**
     * 发送秒杀信息，使用derict模式的交换机。（包含秒杀用户信息，秒杀商品id）
     */
    public void sendMiaoshaMessage(MiaoshaMessage miaoshaMessage){
        log.info(miaoshaMessage.toString());
        // 将对象转换为字符串
       amqpTemplate.convertAndSend(RabbitmqConfig.MIAOSHA_QUEUE,miaoshaMessage.toString());
    }
}
