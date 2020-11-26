package mall.common.config;

import mall.common.service.RedisService;
import mall.common.service.impl.RedisServiceImpl;
import org.springframework.context.annotation.Bean;

/**
 * Redis配置
 * @Created by menghanjun
 * @Date 2020/11/24 4:18 下午
 */
public class BaseRedisConfig {
    //TODO
    @Bean
    public RedisService redisService(){
        return new RedisServiceImpl();
    }
}
