package mall.annotation;

import java.lang.annotation.*;

/**
 * 使用该注解的缓存方法会抛异常
 * @Created by menghanjun
 * @Date 2020/11/24 3:10 下午
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
