package org.meng.mall.service.impl;

import mall.common.service.RedisService;
import org.meng.mall.model.UmsAdmin;
import org.meng.mall.service.UmsAdminCacheService;
import org.meng.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * UmsAdminCacheService实现类
 * Created by macro on 2020/3/13.
 */
@Service
public class UmsAdminCacheServiceImpl implements UmsAdminCacheService {
    @Autowired
    private UmsAdminService adminService;
    @Autowired
    private RedisService redisService;
    //TODO redis相关
//    @Value("${redis.database}")
//    private String REDIS_DATABASE;
//    @Value("${redis.expire.common}")
//    private Long REDIS_EXPIRE;
//    @Value("${redis.key.admin}")
//    private String REDIS_KEY_ADMIN;

    @Override
    public void delAdmin(Long adminId) {
//        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + adminId;
//        redisService.del(key);

    }

    @Override
    public UmsAdmin getAdmin(Long adminId) {
//        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + adminId;
//        return (UmsAdmin) redisService.get(key);
        return null;
    }

    @Override
    public void setAdmin(UmsAdmin admin) {
//        String key = REDIS_DATABASE + ":" + REDIS_KEY_ADMIN + ":" + admin.getId();
//        redisService.set(key, admin, REDIS_EXPIRE);
    }
}
