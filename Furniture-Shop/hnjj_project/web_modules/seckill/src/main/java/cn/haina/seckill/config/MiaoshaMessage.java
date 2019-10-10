package cn.haina.seckill.config;

import cn.haina.entity.User;
import lombok.Data;

@Data
public class MiaoshaMessage {
    private User user;
    private Integer spuId;
}
